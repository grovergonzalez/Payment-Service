package com.project.payment;

import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class PaymentService {

    public boolean processPayment(PaymentDto paymentDto) {
        if (isCardValid(paymentDto)) {
            return true;
        }
        return false;
    }

    private boolean isCardValid(PaymentDto paymentDto) {
        if (paymentDto.getExpirationDate().isBefore(LocalDate.now())) {
            return false;
        }
        return true;
    }
}
