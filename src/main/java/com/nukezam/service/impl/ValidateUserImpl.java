package com.nukezam.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.nukezam.entity.User;
import com.nukezam.mapper.UserInfoMapper;
import com.nukezam.service.ValidateUser;

@Service
public class ValidateUserImpl implements ValidateUser, UserDetailsService {

	@Autowired
	private UserInfoMapper userInfoMapper;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByName(String username, String password) {
		return userInfoMapper.findUser(username, password);
	}

}
