package com.javaguru.lesson10;

import java.util.HashMap;
import java.util.Map;

class HashMapDatabaseImpl implements Database {

    private Map<Long, User> storage = new HashMap<>();
    private Long id = 0L;

    @Override
    public void insert(User user) {
        user.setId(id++);
        storage.put(user.getId(), user);
    }

    @Override
    public User getUser(Long id) {
        return storage.get(id);
    }
}
