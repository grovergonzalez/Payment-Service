package com.project.payment;

import java.time.LocalDate;

public class PaymentDto {
    private String cardNumber;
    private String cvv;
    private LocalDate expirationDate;
    private double amount;

    public PaymentDto(String cardNumber, String cvv, LocalDate expirationDate, double amount) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expirationDate = expirationDate;
        this.amount = amount;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCvv() {
        return cvv;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public double getAmount() {
        return amount;
    }

}
