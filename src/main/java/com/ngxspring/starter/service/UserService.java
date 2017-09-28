package com.ngxspring.starter.service;

import com.ngxspring.starter.models.User;
import com.ngxspring.starter.models.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUser(String name) {
        return userRepository.findByName(name);
    }

    public User addUser(String name, String email, String userName, String password) {
        return userRepository.insert(new User(UUID.randomUUID(), name,
                email, userName, password));
    }

}
