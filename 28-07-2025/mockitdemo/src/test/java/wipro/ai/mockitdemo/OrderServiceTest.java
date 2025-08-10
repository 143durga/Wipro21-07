package wipro.ai.mockitdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

class OrderServiceTest {

    @Test
    public void testPlaceOrder() {
        OrderService mockService = mock(OrderService.class);
        when(mockService.placeOrder("ORD-01")).thenReturn("successful");
        String result = mockService.placeOrder("ORD-01");
        assertEquals("successful", result);
        verify(mockService).placeOrder("ORD-01");
    }
}
