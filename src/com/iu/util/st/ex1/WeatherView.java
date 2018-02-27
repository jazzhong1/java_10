package com.iu.util.st.ex1;

public class WeatherView {

	public void weatherView(Weather[] weathers) {

		for (Weather weather : weathers) {
			System.out.println(weather.getLocation());
			System.out.println(weather.getGion());
			System.out.println(weather.getHum());
			System.out.println(weather.getWind());

		}
	}

	public void weatherView(Weather weathers) {

		System.out.println(weathers.getLocation());
		System.out.println(weathers.getGion());
		System.out.println(weathers.getHum());
		System.out.println(weathers.getWind());

	}

	public void weatherView(String str) {

		System.out.println(str);

	}

}
