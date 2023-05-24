package com.example.demo002.service;
// UserService 接口定义了验证用户的方法。//UserServiceインタフェースは、ユーザーを検証する方法を定義します。
public interface UserService {
    boolean validateUser(String username, String password);
}