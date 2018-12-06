package com.nukezam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class WeatherController {
	
	@GetMapping("/index")
	public String getCityWeather() {
		return "redirect:/index";
	}

}
