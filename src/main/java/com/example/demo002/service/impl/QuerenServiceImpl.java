package com.example.demo002.service.impl;

import com.example.demo002.entity.Queren;
import com.example.demo002.mapper.QuerenMapper;
import com.example.demo002.service.QuerenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuerenServiceImpl implements QuerenService {

    private final QuerenMapper querenMapper;

    @Autowired
    public QuerenServiceImpl(QuerenMapper querenMapper) {
        this.querenMapper = querenMapper;
    }

    public void saveQueren(Queren queren) {


        querenMapper.insert(queren);
    }
}