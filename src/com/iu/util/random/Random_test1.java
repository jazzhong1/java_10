package com.iu.util.random;

import java.util.*;

public class Random_test1 {
	public static void main(String[] args) {
		
		Calendar ca= Calendar.getInstance();
		long l=ca.getTimeInMillis();
		Random random=new Random(l); //Calendar를 이용해서 seed를 넣어준다.
		random.setSeed(l);
	
		int num=random.nextInt();	//랜덤한 숫자를 하나 주겠다.
									//범위 int가 가질수있는 최대~최소
		
		System.out.println(num);
		//가짜 패턴이 존재 
		num=random.nextInt(6);			//0~인자값이하까지
										//정수형을 전문적으로 뽑아줌
		System.out.println(num);
		
	}
}
