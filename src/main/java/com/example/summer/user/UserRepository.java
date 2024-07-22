package com.example.summer.user;

import com.example.summer.accommodation.Accommodation;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class UserRepository {

    HashMap<Integer, User> userTable = new HashMap<>();
    int idx = 0;

    UserRepository() {

    }

    public User saveUser(User user) {
        userTable.put(idx++,user);
        return userTable.get(idx-1);
    }

    public User getUser(User user) {
        for(User u : userTable.values()) {
            if(u.getId().equals(user.getId()) && u.getPw().equals(user.getPw())) return u;
        }
        return null;
    }
}
