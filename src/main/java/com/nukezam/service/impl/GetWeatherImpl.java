package com.nukezam.service.impl;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nukezam.Application;
import com.nukezam.entity.Weather;
import com.nukezam.service.GetWeather;

@Service
public class GetWeatherImpl implements GetWeather {	private ObjectMapper mapper;
	private Logger logger = LoggerFactory.getLogger(Application.class);

	public String getWeather() throws IOException {
		// 101190401
		URL u = new URL(
				"http://api.k780.com/?app=weather.future&weaid=101180101&appkey=32531&sign=68cf0209f9b1bb1961f689ac96b67c5a&format=json");
		InputStream in = u.openStream();
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		try {
			byte buf[] = new byte[1024];
			int read = 0;
			while ((read = in.read(buf)) > 0) {
				out.write(buf, 0, read);
			}
		} finally {
			if (in != null) {
				in.close();
			}
		}
		byte b[] = out.toByteArray();
		return new String(b, "utf-8");
//		System.out.println(new String(b, "utf-8"));
//		return null;
	}

//	public static void main(String[] args) throws IOException {
//		GetWeatherImpl impl = new GetWeatherImpl();
//		Weather impl1 = impl.jasonToWeather();
//	}

	@Override
	public Weather jasonToWeather() {

		Weather weather = null;
		try {

			GetWeatherImpl getWeatherImpl = new GetWeatherImpl();
			ObjectMapper mapper = new ObjectMapper();
			// JSON to POJO
			weather = mapper.readValue(getWeatherImpl.getWeather(), Weather.class);
			logger.debug("获得天气：" + weather.toString());

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return weather;
	}
}
