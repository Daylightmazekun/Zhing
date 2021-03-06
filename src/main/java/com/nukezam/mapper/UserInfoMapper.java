package com.nukezam.mapper;

import com.nukezam.util.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.nukezam.entity.User;

@Mapper
public interface UserInfoMapper extends MyMapper<User> {

    User validateUser(@Param("username") String username, @Param("password") String password);

    User findUserByName(@Param("username") String username);
}
