package com.nukezam.service;

import java.io.IOException;
import java.net.MalformedURLException;

import org.springframework.stereotype.Service;

import com.nukezam.entity.Weather;

@Service
public interface GetWeather {

	public String getWeather() throws MalformedURLException, IOException;

	public Weather jasonToWeather();
}
