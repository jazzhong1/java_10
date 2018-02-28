package com.iu.util.date;

import java.util.*;

public class Date_test4 {

	public static void main(String[] args) {
		
		Calendar cal1=Calendar.getInstance();
		long c1=cal1.getTimeInMillis();
		
		//3일뒤 배송예정입니다.
		
		
		Calendar cal3=Calendar.getInstance();
		System.out.println(c1);
		
		long c2=1000*60*60*24*3;		//3일뒤 계산 
		System.out.println(c2);
		
		
		c1=c1+c2;
		System.out.println(c1);
		cal3.setTimeInMillis(c1);
		System.out.println(cal3.getTime());
		
		//2018년 3월 1일
		cal1.set(2018,2,29);
		System.out.println(cal1.getTime());
		cal1.roll(Calendar.DATE, 3);	//날짜만 변경
		System.out.println(cal1.getTime());
		
		cal1.set(2018,3,29);
		System.out.println(cal1.getTime());
		cal1.add(Calendar.DATE, 3);		//달의 끝을 초과하면 달도 바뀐다.

	
//		
//		resultt1=resultt1/60;	//초
//		resultt1=resultt1/60;	//분
//		resultt1=resultt1/24;	//시간
//		resultt1=resultt1/365;
		
		
				
				
		
	}

}
