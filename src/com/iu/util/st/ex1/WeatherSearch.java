package com.iu.util.st.ex1;

import java.util.*;


public class WeatherSearch {
	private Scanner sc;
	private Weather weather;
	
	public WeatherSearch() {
		sc= new Scanner(System.in);
	}
	
	
	public Weather search(Weather[] weathers){
		System.out.print("도시이름:");
		String name=sc.next();
		
		for (Weather wr:weathers) {
			if(name.equals(wr.getLocation())){
				weather=wr;
			}
		}
		return weather;
	}

}
