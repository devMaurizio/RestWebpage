package dev.maurizio.service;

import dev.maurizio.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> findAll();
    Optional<User> findById(long id);
    void add(User user);
    Optional<User> update(User user);
    Optional<User> delete(long id);
}
