package com.javaguru.lesson10;

public interface Database {

    void insert(User user);

    User getUser(Long id);

}
