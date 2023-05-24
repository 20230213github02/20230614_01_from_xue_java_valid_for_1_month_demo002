package com.example.demo002.Controller;


import com.example.demo002.entity.Kanli;

import com.example.demo002.service.KanliService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
public class KanliController {
    //自动注入依赖//自動注入依存性
    @Autowired
    private KanliService kanliService;

    @PostMapping("/kanli/login")
    public ResponseEntity<String> login(@RequestBody Kanli kanli) {
        String username = kanli.getName();
        String password = kanli.getPassword();
        boolean isValidUser = kanliService.validateUser(username, password);

        if (isValidUser) {
            return ResponseEntity.ok("登录成功");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("登录失败");
        }
    }}

