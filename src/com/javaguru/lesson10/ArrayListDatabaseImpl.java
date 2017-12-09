package com.javaguru.lesson10;

import java.util.ArrayList;
import java.util.List;

class ArrayListDatabaseImpl implements Database {

    private Long id = 0L;

    private List<User> storage = new ArrayList<>();


    @Override
    public void insert(User user) {
        user.setId(id++);
        storage.add(user);
    }

    @Override
    public User getUser(Long id) {
        return storage.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .get();
    }
}
