package com.project.payment;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class PaymentServiceTest {

    @Autowired
    private PaymentService paymentService;

    @Test
    public void processPayment() {
        PaymentDto paymentDto = new PaymentDto("1234567812345678", "123", LocalDate.of(2025, 12, 31), 100.00);

        boolean result = paymentService.processPayment(paymentDto);

        assertThat(result).isTrue();
    }

    @Test
    public void processExpiredPayment() {
        PaymentDto paymentDto = new PaymentDto("1234567812345678", "123", LocalDate.of(2020, 12, 31), 100.00);

        boolean result = paymentService.processPayment(paymentDto);

        assertThat(result).isFalse();
    }
}