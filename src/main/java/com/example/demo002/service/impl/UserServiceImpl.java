package com.example.demo002.service.impl;

import com.example.demo002.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo002.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
   // 在此调用 userMapper 的方法进行用户验证//ユーザー認証のためにuserMapperを呼び出す方法
    public boolean validateUser(String username, String password) {
        return userMapper.verifyUserLogin(username, password);
    }
}