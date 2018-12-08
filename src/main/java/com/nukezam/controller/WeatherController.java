package com.nukezam.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.nukezam.entity.Weather;
import com.nukezam.service.impl.GetWeatherImpl;


@Controller
public class WeatherController {
	
	private GetWeatherImpl getWeatherImpl;
	
	@Autowired
	private Weather weather;
	
	@GetMapping("/")
	public String getHomePage() throws IOException {
		weather = getWeatherImpl.jasonToWeather();
		return "index";
	}

}
