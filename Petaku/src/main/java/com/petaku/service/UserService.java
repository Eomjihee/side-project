package com.petaku.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petaku.repository.UserRepository;
import com.petaku.vo.User;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void userInsert(User user) {
        userRepository.save(user);
    }

    public Iterable<User> userSelect() {
        return userRepository.findAll();
    }
}