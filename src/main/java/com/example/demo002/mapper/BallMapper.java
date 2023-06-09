package com.example.demo002.mapper;

import com.example.demo002.entity.Ball;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BallMapper {

    @Select("SELECT * FROM newspaper")
    List<Ball> selectAllBalls();
}
