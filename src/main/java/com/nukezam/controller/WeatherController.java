package com.nukezam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nukezam.entity.Weather;

@RestController
@RequestMapping("/cities")
public class WeatherController {
	
	@Autowired
	public Weather getCityWeather() {
		return null;
	}

}
