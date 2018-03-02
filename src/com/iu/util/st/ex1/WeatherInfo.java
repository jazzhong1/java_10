package com.iu.util.st.ex1;

import java.util.*;

/**
 * WeatherController
 * 
 * start()
 * 
 * 1. 전체날씨정보출력 2. 검색(지역명 검색시 날씨출력) 3. 날씨정보 초기화 기상청에서 데이터를 다시받아오겠다. 4. 종료
 * 
 * 
 * 출력하는 클래스 view클래스 출력
 *
 */

public class WeatherInfo {
	private String weaterInfo;
	
	public WeatherInfo() {
		
	}
	

	public String getWeaterInfo() {
		return weaterInfo;
	}

	public void setWeaterInfo(String weaterInfo) {
		this.weaterInfo = weaterInfo;
	}
	
	
	public Weather[] getWeather() {
		
		// 지역,온도,습도,풍향
		setWeaterInfo("seoul,10,50,남서," + "busan,32,80,남동," + "daegu,-22,10,북서," + "jeju,-32,75,북서");
		StringTokenizer stz=new StringTokenizer(weaterInfo, ",");
		int index=stz.countTokens();
		index/=4;
		WeaterDatabase.weathers=new Weather[index];
		
		
		
		for (int i = 0; i < WeaterDatabase.weathers.length; i++) {
			WeaterDatabase.weathers[i]=new Weather();
			Weather weather=new Weather();
			
			String result=stz.nextToken();
			
			
			weather.setLocation(result);
			
			result=stz.nextToken();
			weather.setGion(Integer.parseInt(result));
			
			result=stz.nextToken();
			weather.setHum(Integer.parseInt(result));
			
			result=stz.nextToken();
			weather.setWind(result);
			
			WeaterDatabase.weathers[i]=weather;
			
		}
		return WeaterDatabase.weathers;
	}
}
