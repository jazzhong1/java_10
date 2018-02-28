package com.iu.util.date;

import java.text.*;
import java.util.*;

public class Date_test6 {

	public static void main(String[] args) throws ParseException  {
		String s="2017-10-9";
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
		Date date=dateFormat.parse(s);	//dataFormat에 맞게 Stirng 대입하여  date저장
										//문자열을 날짜로 바꿀때도 많이사용
		
		Calendar ca= Calendar.getInstance();
		ca.setTimeInMillis(date.getTime());
		System.out.println(ca.getTime());
		
		System.out.println(dateFormat.format(date));	//출력할때
														//Calendar에 넣으면 month+1해줘야하지만
														//dataFormat에서는  바로 날짜출력가능하다.
	}
}
