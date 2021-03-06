package com.nukezam.service;

import org.springframework.stereotype.Service;

import com.nukezam.entity.User;


public interface ValidateUser {
    User getUserByName(String username, String password);

    User loadUserByUsername(String username);

}
