package com.nukezam.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.nukezam.entity.User;

@Mapper
public interface UserInfoMapper {

    User findUser(@Param("username") String username, @Param("password") String password);

    User findUserByName(@Param("username") String username);
}
