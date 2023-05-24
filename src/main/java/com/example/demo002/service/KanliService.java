package com.example.demo002.service;
// KanliService 接口定义了验证用户的方法。//KanliServiceインタフェースは、ユーザーを検証する方法を定義します。
public interface KanliService {
    boolean validateUser(String username, String password);
}