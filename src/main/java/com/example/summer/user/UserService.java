package com.example.summer.user;

import org.springframework.stereotype.Component;

@Component
public class UserService {

    UserRepository userRepository;

    UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User addUser(User user) {
        return userRepository.saveUser(user);
    }

    public User login(User user) {
        return userRepository.getUser(user);
    }
}
