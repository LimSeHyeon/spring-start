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

    public LoginUser login(User user) {
        User checkedUser = userRepository.getUser(user);
        return new LoginUser(checkedUser.getName(), checkedUser.getId());
    }
}
