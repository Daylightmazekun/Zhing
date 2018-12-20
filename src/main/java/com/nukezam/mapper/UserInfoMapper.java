package com.nukezam.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.nukezam.entity.User;

@Mapper
public interface UserInfoMapper {

    User validateUser(@Param("userName") String username, @Param("passWord") String password);

    User findUserByName(@Param("userName") String username);
}
