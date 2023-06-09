// ApplicationServiceImpl.java
package com.example.demo002.service.impl;

import com.example.demo002.entity.Application;
import com.example.demo002.mapper.ApplicationMapper;
import com.example.demo002.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationServiceImpl implements ApplicationService {
    private final ApplicationMapper applicationMapper;

    @Autowired
    public ApplicationServiceImpl(ApplicationMapper applicationMapper) {
        this.applicationMapper = applicationMapper;
    }

    @Override
    public List<Application> getAllApplications() {
        return applicationMapper.selectAllApplications();
    }
}
