package com.iu.util.st.ex1;

import java.util.*;

public class WeatherController {
	
private	WeatherInfo info;
private	WeatherView view;
private WeatherSearch search;
private	Scanner sc;
	
	
	
	public WeatherController() {
		
		info=new WeatherInfo();
		view=new WeatherView();
		search=new WeatherSearch();
		sc=new Scanner(System.in);
		WeaterDatabase.weathers=info.getWeather();
	}
	
	public void start(){
		
		boolean check=true;
		while(check){
			System.out.println("1.전체날씨정보출력|2.지역검색|3.날씨정보 초기화|4.종료");
			int num=sc.nextInt();
			switch (num) {
			case 1:
				System.out.println("전체날씨정보출력");
				view.weatherView(WeaterDatabase.weathers);
				break;
				
			case 2:
				System.out.println("지역검색");
				WeaterDatabase.weather=search.search(WeaterDatabase.weathers);

				if(WeaterDatabase.weather!=null){
					view.weatherView(WeaterDatabase.weather);
				}
				else{
					view.weatherView("나라가 없습니다.");
				}
				
				break;
				
			case 3:
				System.out.println("날씨정보 초기화");
				WeaterDatabase.weathers=info.getWeather();
				view.weatherView("초기화 완료");
				
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
