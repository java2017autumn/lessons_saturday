package com.javaguru.lesson12;

import com.javaguru.lesson12.database.UserDatabase;
import com.javaguru.lesson12.domain.User;
import com.javaguru.lesson12.services.UserService;
import com.javaguru.lesson12.validators.LoginValidator;
import com.javaguru.lesson12.validators.PasswordValidator;
import com.javaguru.lesson12.validators.UserValidator;

public class UserServiceTest {

    public static void main(String[] args) {
        User user = new User();
        user.setLogin("userLogin");
        user.setPassword("1234567890");
        user.setRepeatPassword("1234567890");

        UserValidator userValidator = new UserValidator();
        userValidator.addValidator(new LoginValidator());
        userValidator.addValidator(new PasswordValidator());

        UserDatabase userDatabase = new UserDatabase();
        UserService userService = new UserService(userValidator, userDatabase);

        userService.createUser(user);
    }
}
