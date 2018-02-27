package com.iu.util.st.ex1;

import java.util.*;

public class WeatherController {
	
private	WeatherInfo info;
private	WeatherView view;
private WeatherSearch search;
private	Scanner sc;
private Weather[] weathers;
private Weather weather;
	
	
	
	public WeatherController() {
		
		info=new WeatherInfo();
		view=new WeatherView();
		search=new WeatherSearch();
		sc=new Scanner(System.in);
		weathers=info.getWeather();
	}
	
	public void start(){
		
		boolean check=true;
		while(check){
			System.out.println("1.전체날씨정보출력|2.지역검색|3.날씨정보 초기화|4.종료");
			int num=sc.nextInt();
			switch (num) {
			case 1:
				System.out.println("전체날씨정보출력");
				view.weatherView(weathers);
				break;
				
			case 2:
				System.out.println("지역검색");
				weather=search.search(weathers);

				if(weather!=null){
					view.weatherView(weather);
				}
				else{
					view.weatherView("나라가 없습니다.");
				}
				
				break;
				
			case 3:
				System.out.println("날씨정보 초기화");
				weathers=info.getWeather();
				
				break;
				
			case 4:
				check=!check;
				break;

			default:
				break;
			}
		
		}
	}

}
