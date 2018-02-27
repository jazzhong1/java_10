package com.iu.lang.String;

public class String_test1 {
	public static void main(String[] args) {
		System.out.println(String.CASE_INSENSITIVE_ORDER);
									//상수를 의미한다.
		
		String ja="java";
		char a=ja.charAt(1);
		System.out.println(a);	//배열인덱스로 받는다.
		
		System.out.println(ja.concat("ㄷㄷㅇ"));
	}
}
