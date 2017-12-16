package com.javaguru.lesson12.services;

import com.javaguru.lesson12.database.UserDatabase;
import com.javaguru.lesson12.domain.User;
import com.javaguru.lesson12.validators.UserValidator;

public class UserService {

    private UserValidator validator;
    private UserDatabase userDatabase;

    public UserService(UserValidator validator, UserDatabase userDatabase) {
        this.validator = validator;
        this.userDatabase = userDatabase;
    }

    public void createUser(User user) {
        validator.validate(user);
        userDatabase.save(user);
    }
}
