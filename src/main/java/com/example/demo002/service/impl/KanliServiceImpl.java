package com.example.demo002.service.impl;

import com.example.demo002.mapper.KanliMapper;

import com.example.demo002.service.KanliService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KanliServiceImpl implements KanliService {
    @Autowired
    private KanliMapper kanliMapper;
    // 在此调用 kanliMapper 的方法进行用户验证//ここでkanliMapperを呼び出す方法によるユーザー認証
    public boolean validateUser(String username, String password) {
        return kanliMapper.verifyUserLogin(username, password);
    }
}