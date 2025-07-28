package com.cognizant.spring_learn.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cognizant.spring_learn.model.User;

@Service
public class UserService {

    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User("admin", "admin123", "ADMIN"));
        users.add(new User("user", "user123", "USER"));
    }

    public User getUserByUsername(String username) {
        return users.stream()
                .filter(user -> user.getUsername().equals(username))
                .findFirst()
                .orElse(null);
    }
}
