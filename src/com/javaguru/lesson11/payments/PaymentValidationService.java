package com.javaguru.lesson11.payments;

import java.math.BigDecimal;

public class PaymentValidationService {

    void validate(Payment payment) {
        checkPaymentNotNull(payment);
        checkPaymentFieldsNotNull(payment);
        checkPaymentByType(payment);
    }

    private void checkPaymentByType(Payment payment) {
        switch (payment.getType()) {
            case DEPOSIT:
                checkDeposit(payment);
                break;
            case WITHDRAWAL:
                checkWithdrawal(payment);
                break;
            default:
                throw new PaymentValidationException("Incorrect payment type");
        }
    }

    private void checkPaymentNotNull(Payment payment) {
        if (payment == null) {
            throw new PaymentValidationException("Payment cannot be null");
        }
    }

    private void checkPaymentFieldsNotNull(Payment payment) {
        if (payment.getAmount() == null || payment.getType() == null) {
            throw new PaymentValidationException("Incorrect payment data");
        }
    }

    private void checkDeposit(Payment payment) {
        if (payment.getAmount().compareTo(BigDecimal.ZERO) <= 0) {
            throw new PaymentValidationException("Deposit cannot be less than zero");
        }
    }

    private void checkWithdrawal(Payment payment) {
        if (payment.getAmount().compareTo(BigDecimal.ZERO) >= 0) {
            throw new PaymentValidationException("Withdrawal cannot be more than zero");
        }
    }
}
