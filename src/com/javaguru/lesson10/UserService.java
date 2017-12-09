package com.javaguru.lesson10;

class UserService {

    private Database database;

    UserService(Database database) {
        this.database = database;
    }

    public void saveUser(User user) {
        // add validation
        database.insert(user);
    }

    public User getUser(Long id) {
        User databaseUser = database.getUser(id);
        return new User(databaseUser.getId(), databaseUser.getName(), databaseUser.getSurname());
    }
}
