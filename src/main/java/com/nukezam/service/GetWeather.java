package com.nukezam.service;

import java.io.IOException;
import java.net.MalformedURLException;

import com.nukezam.entity.Weather;

public interface GetWeather {

	public String getWeather() throws MalformedURLException, IOException;
	public Weather jasonToWeather();
}
