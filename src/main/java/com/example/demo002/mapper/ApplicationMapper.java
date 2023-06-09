package com.example.demo002.mapper;

import com.example.demo002.entity.Application;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ApplicationMapper {

    @Select("SELECT * FROM news")
    List<Application> selectAllApplications();
}