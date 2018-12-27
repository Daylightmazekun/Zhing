package com.nukezam.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import com.nukezam.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class UserInfoController {

    @RequestMapping("/homepage")
    public ModelAndView homepage(User user) throws IOException {
        ModelAndView result = new ModelAndView("homepage");
        result.addObject("user", user);
        return result;
    }
}
