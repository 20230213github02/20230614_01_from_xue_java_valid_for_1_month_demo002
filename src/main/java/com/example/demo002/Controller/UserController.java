package com.example.demo002.Controller;
import com.example.demo002.entity.User;

import com.example.demo002.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
public class UserController {
//   自动注入依赖//自動注入依存性
    @Autowired
    private UserService userService;

    @PostMapping("/user/login")
    public ResponseEntity<String> login(@RequestBody User user) {
        String username = user.getName();
        String password = user.getPassword();
        boolean isValidUser = userService.validateUser(username, password);

        if (isValidUser) {
            return ResponseEntity.ok("登录成功");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("登录失败");
        }
    }}

