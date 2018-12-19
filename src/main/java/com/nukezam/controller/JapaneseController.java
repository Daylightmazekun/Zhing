package com.nukezam.controller;


import com.nukezam.entity.User;
import com.nukezam.service.Japanese;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JapaneseController {

    @Autowired
    private Japanese japanese;

    @GetMapping("/japanese")
    public ModelAndView toJapanese(User user){
        User getUser = new User();
        return null;
        // TODO
    }
}
