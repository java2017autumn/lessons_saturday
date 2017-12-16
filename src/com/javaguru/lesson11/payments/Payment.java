package com.javaguru.lesson11.payments;

import java.math.BigDecimal;

class Payment {

    private PaymentType type;
    private BigDecimal amount;

    Payment(PaymentType type, BigDecimal amount) {
        this.type = type;
        this.amount = amount;
    }

    public PaymentType getType() {
        return type;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "type=" + type +
                ", amount=" + amount +
                '}';
    }
}
