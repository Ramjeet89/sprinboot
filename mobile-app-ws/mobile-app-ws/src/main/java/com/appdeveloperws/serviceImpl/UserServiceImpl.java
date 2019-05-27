package com.appdeveloperws.serviceImpl;

import com.appdeveloperws.model.User;
import com.appdeveloperws.model.UserDetails;
import com.appdeveloperws.service.UserService;
import com.appdeveloperws.shared.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    Map<String, User> users;
    Utils  utils;

    public UserServiceImpl(){

    }

    @Autowired
    public UserServiceImpl(Utils utils){
        this.utils = utils;
    }

    @Override
    public User createUser(UserDetails userDetails) {

        User user = new User();
        user.setFirstName(userDetails.getFirstName());
        user.setLastName(userDetails.getLastName());
        user.setEmail(userDetails.getEmail());

        String userId = utils.generateUserId();
        user.setEmplId(userId);
        if (users == null) users = new HashMap<>();
        users.put(userId, user);
        return user;
    }
}
