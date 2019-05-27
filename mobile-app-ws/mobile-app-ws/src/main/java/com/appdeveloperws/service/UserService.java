package com.appdeveloperws.service;

import com.appdeveloperws.model.User;
import com.appdeveloperws.model.UserDetails;

public interface UserService {
    User createUser(UserDetails userDetails);
}
