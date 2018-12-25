package com.nukezam.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import com.nukezam.entity.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class UserInfoController {

    @RequestMapping("/homepage")
    public String homepage(User user, Model model) throws IOException {

        model.addAttribute("user", user);
        return "homepage";
    }
}
