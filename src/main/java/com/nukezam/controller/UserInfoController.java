package com.nukezam.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nukezam.entity.User;
import com.nukezam.service.impl.ValidateUserImpl;

@Controller
public class UserInfoController {
    @Autowired
    private ValidateUserImpl validateUserImpl;

    @PostMapping("/login")
    public ModelAndView validateUser(User user) throws IOException {
        User getUser = new User();
        getUser = validateUserImpl.getUserByName(user.getUserName(), user.getPassWord());
        ModelAndView result = new ModelAndView();
        if (getUser == null) {
            result.setViewName("login");
            return result;
        }

        result.setViewName("homepage");
        result.addObject("user", getUser);
        return result;
    }
}
