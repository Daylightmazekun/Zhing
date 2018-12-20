package com.nukezam.controller;

import java.io.IOException;

import com.nukezam.service.ValidateUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nukezam.entity.User;


@Controller
public class UserInfoController {
    @Autowired
    private ValidateUser validateUser;

    @PostMapping("/login")
    public String validateUser(User user) throws IOException {
        User getUser = new User();
        getUser = validateUser.getUserByName(user.getUserName(), user.getPassWord());
        ModelAndView result = new ModelAndView();
        if (getUser == null) {
            return "relogin";
        }

        result.addObject("user", getUser);
        return "homepage";
    }
}
