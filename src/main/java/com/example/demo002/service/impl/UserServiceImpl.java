package com.example.demo002.service.impl;

import com.example.demo002.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo002.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public boolean validateUser(String username, String password) {
        return userMapper.verifyUserLogin(username, password);
    }
}