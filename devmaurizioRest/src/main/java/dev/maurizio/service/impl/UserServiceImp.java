package dev.maurizio.service.impl;

import dev.maurizio.model.User;
import dev.maurizio.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImp implements UserService {

    public static List<User> userList = new ArrayList<>();

    private static Integer COUNTER = 1;

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

        return userList;
    }
}
