package com.iu.util.st;

import java.util.*;

public class St_test {
	public static void main(String[] args) {
		Nation nation=null;
		String nation2="Norway 14 14 11 "
				+ "German 10 10 7 "
				+ "Canada 11 8 10 "
				+ "USA 9 8 6 "
				+ "Korea 5 8 4 ";
		
		StringTokenizer stringTokenizer=new StringTokenizer(nation2," ");
		//데어터여러가지가 하나의 클래스라면 Tokenizer가 편하다.
		
		while(stringTokenizer.hasMoreTokens()){
			nation=new Nation();
			String result=stringTokenizer.nextToken();
			nation.setName(result);
			nation.setGold(stringTokenizer.nextToken());
			nation.setSilver(stringTokenizer.nextToken());
			nation.setBronze(stringTokenizer.nextToken());
			System.out.println(result);
		}
		
		String names="iu-suli-hani";
		//데이터가 하나씩 짤라진다면 spilt이 편하다.
	}
}
