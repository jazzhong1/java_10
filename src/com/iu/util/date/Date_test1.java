package com.iu.util.date;

import java.util.*;	//아스타

public class Date_test1 {
	
	public static void main(String[] args) {
		
		Calendar ca=Calendar.getInstance();

		System.out.println(ca);//java.util.GregorianCalenda 상속받기때문에 앞에 이렇게나옴
		
		Date d=ca.getTime();//현재시간 전체를 찍어줌 리턴타입 Date
		
		int year=ca.get(Calendar.YEAR);		
		System.out.println(year);
		
		int month=ca.get(Calendar.MONTH);	//컴퓨터 시작을0으로 잡기때문에 
		System.out.println(month);
		int day=ca.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		
		// 현재요일
		//시,분 초
		
		int e=ca.get(Calendar.DAY_OF_WEEK);
		System.out.println(e);
		int hour=ca.get(Calendar.HOUR_OF_DAY);		//HOUR는 12시간방식
											//HOUROFDAY 24시간방식
		System.out.println(hour);
		int minute=ca.get(Calendar.MINUTE);
		System.out.println(minute);
		int second=ca.get(Calendar.SECOND);
		System.out.println(second);
		
		System.out.println();
		
		int a=ca.get(Calendar.AM_PM);
		System.out.println(a);

		int a1=ca.get(Calendar.AM);
		System.out.println(a1);
		
		int a2=ca.get(Calendar.PM);
		System.out.println(a2);
	}
}
