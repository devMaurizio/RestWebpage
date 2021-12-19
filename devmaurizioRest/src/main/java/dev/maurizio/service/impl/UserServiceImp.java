package dev.maurizio.service.impl;

import dev.maurizio.model.User;
import dev.maurizio.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImp implements UserService {
    @Override
    public List<User> findAll() {

        List<User> listUsers = new ArrayList<>();
        
        return listUsers;
    }
}
