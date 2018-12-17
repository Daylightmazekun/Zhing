package com.nukezam.service.impl;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.nukezam.entity.User;
import com.nukezam.mapper.UserInfoMapper;
import com.nukezam.service.ValidateUser;

import javax.annotation.Resource;

@Service
public class ValidateUserImpl implements ValidateUser {

    @Resource
    private UserInfoMapper userInfoMapper;

    @Override
    public User getUserByName(String username, String password) {
        return userInfoMapper.findUser(username, password);
    }
    @Override
    public User loadUserByUsername(String username) {
        return userInfoMapper.findUserByName(username);
    }
}
