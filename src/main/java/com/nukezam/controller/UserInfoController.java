package com.nukezam.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.nukezam.service.impl.ValidateUserImpl;

@Controller
public class UserInfoController {
	@Autowired
	private ValidateUserImpl validateUserImpl;

	@GetMapping("/login")
	public String validateUser(ModelMap model) throws IOException {
		return null;
	}
}
