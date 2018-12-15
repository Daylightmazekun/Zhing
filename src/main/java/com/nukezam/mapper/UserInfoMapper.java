package com.nukezam.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.nukezam.entity.User;
import com.nukezam.util.MyMapper;

@Mapper
public interface UserInfoMapper{

	User findUser(@Param("username") String username, @Param("password") String password);
}
