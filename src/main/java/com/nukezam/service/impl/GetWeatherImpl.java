package com.nukezam.service.impl;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import com.nukezam.service.GetWeather;

public class GetWeatherImpl implements GetWeather{


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
		// System.out.println(new String(b,"utf-8"));
	}
}
