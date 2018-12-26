package com.nukezam.controller;

import com.github.pagehelper.PageInfo;
import com.nukezam.entity.JapaneseWord;
import com.nukezam.entity.User;
import com.nukezam.service.Japanese;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/japanese")
public class JapaneseController {

    @Autowired
    private Japanese japanese;

    @RequestMapping
    public ModelAndView toJapanese(User user){
        // User getUser = new User();
        ModelAndView result = new ModelAndView("janpanese");
        List<JapaneseWord> japaneseWordList = japanese.findJapaneseByUserId(user.getUserid());
        result.addObject("pageInfo", new PageInfo<JapaneseWord>(japaneseWordList));
        result.addObject("queryParam", user);
        result.addObject("page", user.getPage());
        result.addObject("rows", user.getRows());
        return result;

    }
}
