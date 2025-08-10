package com.orderms.service;

import com.orderms.model.Order;
import com.orderms.model.Payment;
import com.orderms.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private RestTemplate restTemplate;

    public Order saveOrder(Order order) {
        Order savedOrder = orderRepository.save(order);

        if (order.getPayment() != null && !order.getPayment().isEmpty()) {
            for (Payment payment : order.getPayment()) {
                payment.setOrderId(savedOrder.getId().intValue()); // link to Order ID
                try {
                    String url = "http://localhost:8081/payment";
                    restTemplate.postForObject(url, payment, Payment.class); // send to PaymentMS
                } catch (Exception e) {
                    System.out.println("❌ Failed to post payment: " + e.getMessage());
                }
            }
        }

        return savedOrder;
    }


    public List<Order> getAllOrdersWithPayments() {
        List<Order> orderList = orderRepository.findAll();

        for (Order order : orderList) {
            int orderId;

            try {
                orderId = order.getId().intValue(); // use actual DB ID, not from orderNumber
            } catch (Exception e) {
                System.out.println("❌ Invalid Order ID");
                continue;
            }

            try {
                String url = "http://localhost:8081/payment/order/" + orderId;
                Payment[] payments = restTemplate.getForObject(url, Payment[].class);
                order.setPayment(Arrays.asList(payments));
            } catch (Exception e) {
                System.out.println("⚠️ Could not fetch payments for Order ID " + orderId);
                order.setPayment(List.of());
            }
        }

        return orderList;
    }
}
