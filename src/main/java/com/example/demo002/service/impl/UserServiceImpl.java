package com.example.demo002.service.impl;

import org.springframework.stereotype.Service;
import com.example.demo002.service.UserService;


@Service
public class UserServiceImpl implements UserService {


    public boolean validateUser(String username, String password) {
        // 假设数据库中已存在一个名为"admin"，密码为"password"的用户
        if ("admin".equals(username) && "password".equals(password)) {
            return true; // 验证成功
        } else {
            return false; // 验证失败
        }
    }
}