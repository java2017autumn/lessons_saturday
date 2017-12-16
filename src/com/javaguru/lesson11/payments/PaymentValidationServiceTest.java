package com.javaguru.lesson11.payments;

import java.math.BigDecimal;

public class PaymentValidationServiceTest {

    private static PaymentValidationService service = new PaymentValidationService();

    public static void main(String[] args) {
        shouldValidateDepositSuccess();
        shouldThrowExceptionZeroAmount();
    }

    public static void shouldValidateDepositSuccess() {
        Payment deposit = new Payment(PaymentType.DEPOSIT, new BigDecimal("120.00"));
        service.validate(deposit);
        printResult("shouldValidateDepositSuccess", true);
    }

    public static void shouldThrowExceptionZeroAmount() {
        Payment deposit = new Payment(PaymentType.DEPOSIT, BigDecimal.ZERO);
        try {
            service.validate(deposit);
            printResult("shouldThrowExceptionZeroAmount", false);
        } catch (PaymentValidationException e) {
            printResult("shouldThrowExceptionZeroAmount", true);
        }
    }

    private static void printResult(String testName, boolean isSuccess) {
        if (isSuccess) {
            System.out.println(testName + ": SUCCESS");
        } else {
            System.err.println(testName + ": FAIL");
        }
    }

}
