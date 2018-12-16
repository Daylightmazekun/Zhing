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

	User user = userService.findBySso(username);
	if(user==null){
		logger.info("User not found");
		throw new UsernameNotFoundException("Username not found");
	}
		return new org.springframework.security.core.userdetails.User(user.getSso_id(), user.getPassword(), 
			 user.getState().equals("Active"), true, true, true, getGrantedAuthorities(user));
	}

	@Override
	public User getUserByName(String username, String password) {
		return userInfoMapper.findUser(username, password);
	}

}
