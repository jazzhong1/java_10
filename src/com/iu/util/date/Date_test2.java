package com.iu.util.date;

import java.util.*;

public class Date_test2 {

	public static void main(String[] args) {

		// 날짜 변경

		Calendar ca = Calendar.getInstance();
		Calendar cur = Calendar.getInstance();

		ca.set(Calendar.YEAR, 987); // 년도 변경
		System.out.println(ca.get(Calendar.YEAR));

		ca.set(Calendar.MONTH, 11);
		System.out.println(ca.get(Calendar.MONTH) + 1);

		// 1997,11월 13일

		ca.set(1997, 10, 13);
		
		Date date=ca.getTime();		//getTime은 현재시간을 Date타입으로 리턴
		System.out.println(date);
	}
}
