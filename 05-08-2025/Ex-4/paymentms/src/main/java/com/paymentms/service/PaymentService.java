package com.paymentms.service;

import com.paymentms.model.Payment;
import com.paymentms.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    public List<Payment> getPaymentsByOrderId(int orderId) {
        return paymentRepository.findByOrderId(orderId);
    }

    public Payment savePayment(Payment payment) {
        return paymentRepository.save(payment);
    }
}
