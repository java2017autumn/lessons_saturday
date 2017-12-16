package com.javaguru.lesson12.validators;

import com.javaguru.lesson12.domain.User;

public class LoginValidator implements Validator<User> {

    @Override
    public void validate(User user) {
        String login = user.getLogin();

        checkNotNull(login);
        checkLoginLength(login);

    }

    private void checkLoginLength(String login) {
        if (login.length() < 3 || login.length() > 10) {
            throw new UserValidationException("Incorrect login length");
        }
    }
}
