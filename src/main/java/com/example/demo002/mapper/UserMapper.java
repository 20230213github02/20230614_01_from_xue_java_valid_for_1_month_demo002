package com.example.demo002.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("SELECT COUNT(*) FROM user WHERE username = #{name} AND password = #{password}")
    int verifyUserLogin(@Param("name") String name, @Param("password") String password);
}
