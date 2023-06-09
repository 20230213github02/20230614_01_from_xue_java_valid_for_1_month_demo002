
package com.example.demo002.service.impl;

import com.example.demo002.entity.Ball;
import com.example.demo002.mapper.BallMapper;
import com.example.demo002.service.BallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BallServiceImpl implements BallService {
    private final BallMapper ballMapper;

    @Autowired
    public BallServiceImpl(BallMapper ballMapper) {
        this.ballMapper = ballMapper;
    }

    @Override
    public List<Ball> getAllBalls() {
        return ballMapper.selectAllBalls();
    }
}
