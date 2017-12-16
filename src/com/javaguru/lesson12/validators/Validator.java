package com.javaguru.lesson12.validators;

public interface Validator<T> {

    void validate(T t);

    default <T> void checkNotNull(T t) {
        if (t == null) {
            throw new UserValidationException("Must be not null");
        }
    }

    class UserValidationException extends RuntimeException {
        public UserValidationException(String message) {
            super(message);
        }
    }
}
