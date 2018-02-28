package com.iu.util.date;

import java.util.*;

public class Date_test3 {

	public static void main(String[] args) {
		
		Calendar ca=Calendar.getInstance();
		long l=ca.getTimeInMillis();		//1초를 1000으로 표기
											//1970년도기준으로 흘로인시간부터 현재까지 밀리세컨을 표기
											//시간차를 구할때 좋음
		Date d=new Date();
		d.setTime(l);
		Date d2=new Date(l);
		System.out.println(d2);
		
		Calendar ca2=Calendar.getInstance();
		Calendar ca3=Calendar.getInstance();
		int ca1=ca.get(Calendar.MINUTE);
		ca.set(Calendar.HOUR,11);
		ca.set(Calendar.MINUTE,1);
		
		ca2.set(Calendar.MINUTE, 56);
		
		long cal1=ca.getTimeInMillis();
		long cal2=ca2.getTimeInMillis();
		
		long result=cal1-cal2;
		
		long result1=result/1000;	//getTimeInMillis /1000 하면 초 계산
		System.out.println(result1);
		
		long result2=result1/60;
		System.out.println(result2);	//초에서  /60 하면 초 계산
		
		//생일 
		//태어난지 몇일이 흘렀느냐
		
		
		Calendar calendar1=Calendar.getInstance();
		Calendar calendar2=Calendar.getInstance();
		Date date1=new Date();
		calendar1.set(1993,5, 9);
		long bir=calendar1.getTimeInMillis();
		long now=calendar2.getTimeInMillis();
		
		long result3=now-bir;
		
		long resultt1;
		
		resultt1=result3/1000;
		resultt1=resultt1/60;	//초
		resultt1=resultt1/60;	//분
		resultt1=resultt1/24;	//시간
		resultt1=resultt1/365;	//년 구하기 
		
		System.out.println(resultt1);
		

		
		
		
		
		
		
	}
}
