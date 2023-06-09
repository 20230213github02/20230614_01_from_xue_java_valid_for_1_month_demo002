package com.example.demo002.Controller;

import com.example.demo002.entity.Ball;
import com.example.demo002.service.BallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/newspaper")
public class BallController {
    @Autowired
    private BallService ballService;




    @GetMapping("/balls")
    public List<Ball> getAllBalls() {
        return ballService.getAllBalls();
    }

}
