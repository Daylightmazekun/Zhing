package com.nukezam.entity;

import java.util.List;

public class Weather {
	private String success;

	private List<WeatherResult> result;

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setResult(List<WeatherResult> result) {
		this.result = result;
	}

	public List<WeatherResult> getResult() {
		return this.result;
	}
}
