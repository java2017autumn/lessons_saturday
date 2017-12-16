package com.javaguru.lesson12.validators;

import com.javaguru.lesson12.domain.User;

import java.util.HashSet;
import java.util.Set;

public class UserValidator implements Validator<User> {

    private Set<Validator<User>> validators = new HashSet<>();

    @Override
    public void validate(User user) {
        checkNotNull(user);
        validators.forEach(validator -> validator.validate(user));
    }

    public void addValidator(Validator<User> validator) {
        validators.add(validator);
    }
}
