package com.javaguru.lesson12.validators;

import com.javaguru.lesson12.domain.User;

public class PasswordValidator implements Validator<User> {

    @Override
    public void validate(User user) {
        String password = user.getPassword();
        String repeatPassword = user.getRepeatPassword();

        checkNotNull(password);
        checkNotNull(repeatPassword);

        checkPasswordLength(password);
        checkPasswordLength(repeatPassword);

        checkPasswordIdentity(password, repeatPassword);
    }

    private void checkPasswordLength(String password) {
        if (password.length() < 8 || password.length() > 20) {
            throw new UserValidationException("Incorrect password length");
        }
    }

    private void checkPasswordIdentity(String password, String repeatPassword) {
        if (!password.equals(repeatPassword)) {
            throw new UserValidationException("Passwords are not equals");
        }
    }
}
