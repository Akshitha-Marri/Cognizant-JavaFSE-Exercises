package com.cognizant.spring_learn.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // For demo: username is "admin", password is "admin"
        if ("admin".equals(username)) {
            return new User("admin", "{noop}admin", new ArrayList<>()); // {noop} means no password encoding
        } else {
            throw new UsernameNotFoundException("User not found");
        }
    }
}
