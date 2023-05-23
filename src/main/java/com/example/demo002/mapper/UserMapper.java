package com.example.demo002.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
//验证用户
@Mapper
public interface UserMapper {
    @Select("SELECT COUNT(*) FROM user WHERE name = #{name} AND password = #{password}")
    boolean verifyUserLogin(@Param("name") String name, @Param("password") String password);
}
