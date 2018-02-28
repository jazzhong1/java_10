package com.iu.util.date;

import java.text.*;
import java.util.*;

public class Date_test5 {

	public static void main(String[] args) {
		Calendar ca=Calendar.getInstance();
		//2018년 3월 2일 13시 20분 22초 월요일
		
		System.out.println(ca.getTime());
		
		int year=ca.get(Calendar.YEAR);
		int month=ca.get(Calendar.MONTH);
		int day=ca.get(Calendar.DATE);
		int hour=ca.get(Calendar.HOUR_OF_DAY);
		int minute=ca.get(Calendar.MINUTE);
		int seound=ca.get(Calendar.SECOND);
		
		System.out.println(year+"년 "+(month+1)+"월 "+day+"일 "+hour+"시 "+minute+"분 "+seound+"초");
		
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy년 MM월 dd일  hh시 mm분 ss초 E요일");
		Date date=new Date();
		date=ca.getTime();
		String result=dateFormat.format(date);
		System.out.println(result);
		
		
		
	}
}
