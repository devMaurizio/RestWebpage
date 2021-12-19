package dev.maurizio.service.impl;

import dev.maurizio.model.User;
import dev.maurizio.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImp implements UserService {

    public static List<User> userList = new ArrayList<>();

    private static long COUNTER = 1;

    static {
        User user = new User(COUNTER++, "Test1", "Werf", "35", "1234AB", "secretStreet", "dummyCity", "Netherlands", "Secret");
        userList.add(user);

        user = new User(COUNTER++, "Test2", "abc", "35", "1234AB", "secretStreet", "dummyCity", "Netherlands", "Secret");
        userList.add(user);

        user = new User(COUNTER++, "Test3", "tester", "35", "1234AB", "secretStreet", "dummyCity", "Netherlands", "Secret");
        userList.add(user);

        user = new User(COUNTER++, "Test4", "AUTOMATION", "35", "1234AB", "secretStreet", "dummyCity", "Netherlands", "Secret");
        userList.add(user);
    }

    @Override
    public List<User> findAll() {

        return userList.stream().sorted(Comparator.comparing(User::getId)).collect(Collectors.toList());
    }

    @Override
    public Optional<User> findById(long id) {

        return userList.stream().filter(user -> user.getId() == id).findFirst();
    }

    @Override
    public void add(User user) {
        user.setId(COUNTER++);
        userList.add(user);
    }

    @Override
    public Optional<User> update(User user) {
        Optional<User> userOptional = userList.stream().filter(u -> user.getId() == u.getId()).findFirst();

        if (userOptional.isPresent()){
            User existingUser = userOptional.get();

            if (user.getFirstname() != null) {
                existingUser.setFirstname(user.getFirstname());
            }

            if (user.getLastname() != null) {
                existingUser.setLastname(user.getLastname());
            }

            if (user.getAge() != null) {
                existingUser.setAge(user.getAge());
            }

            if (user.getPostcode() != null) {
                existingUser.setPostcode(user.getPostcode());
            }

            if (user.getStreet() != null) {
                existingUser.setStreet(user.getStreet());
            }

            if (user.getCity() != null) {
                existingUser.setCity(user.getCity());
            }

            if (user.getCountry() != null) {
                existingUser.setCountry(user.getCountry());
            }

            if (user.getCompany() != null) {
                existingUser.setCompany(user.getCompany());
            }

            userList = userList
                    .stream()
                    .filter(u -> u.getId() != existingUser.getId())
                    .collect(Collectors.toList());

            userList.add(existingUser);

            return Optional.of(existingUser);
        }

        return Optional.empty();
    }

    @Override
    public Optional<User> delete(long id) {
        Optional<User> userOptional = userList.stream().filter(user -> user.getId() == id).findFirst();

        if (userOptional.isPresent()) {
            userList = userList.stream().filter(user -> userOptional.get().getId() != user.getId()).collect(Collectors.toList());
            return userOptional;
        }

        return Optional.empty();
    }
}
