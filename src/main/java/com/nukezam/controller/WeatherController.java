package com.nukezam.controller;

import java.io.IOException;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.nukezam.entity.Weather;
import com.nukezam.service.impl.GetWeatherImpl;

@Controller
public class WeatherController {
    @Autowired
    private GetWeatherImpl getWeatherImpl;

    @GetMapping("/")
    public String getHomePage(ModelMap model) throws IOException {
        Weather weather = getWeatherImpl.jasonToWeather();
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("city", weather.getResult().get(0).getCitynm());
        map.put("todayWeather", weather.getResult().get(0).getWeather());
        model.addAttribute("weather", map);
        return "login";
    }

}
