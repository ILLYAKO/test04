package com.illya.web.service;

import com.illya.web.domain.User;
import com.illya.web.repository.UserRepository;

public class UserService {

    public UserService() {}

    public User findUserByUsername(User user){
        UserRepository userRepository = new UserRepository();
        return userRepository.findUserByUsername(user);
    }

    public User registrationNewUser(User user){
        UserRepository userRepository = new UserRepository();
        return userRepository.registrationUser(user);
    }




}
