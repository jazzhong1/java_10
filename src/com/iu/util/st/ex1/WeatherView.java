package com.iu.util.st.ex1;

public class WeatherView {

	public void weatherView(Weather[] wr) {

		for (Weather weathers : wr) {
		
			this.weatherView(weathers);
		}
	}

	public void weatherView(Weather weathers) {
		System.out.println("지역:"+weathers.getLocation());
		System.out.println("온도:"+weathers.getGion());
		System.out.println("습도:"+weathers.getHum());
		System.out.println("바람:"+weathers.getWind());
	}

	public void weatherView(String str) {
		System.out.println(str);

	}
}
