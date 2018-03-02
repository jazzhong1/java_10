package com.iu.lang.wrapper;

import java.util.*;

public class Wrapper_test3 {
	public static void main(String[] args) {
		
		//비밀번호 체크
		//최소한 두개이상의 숫자
		//최소한 두개이상의 대문자
		//최소한 두개이상의 숫자
		//공백이 포함되면 안됨
		//최소 8글자 이상이 되어야함
		
		Scanner sc=new Scanner(System.in);
		System.out.print("비밀번호를 입력하세요");
		String pw=sc.next();
		
		boolean check=true;
		System.out.println("비밀번호체크중..");
		int upperCount=0;
		int lowerCount=0;
		int digitCount=0;
		int count=0;
		boolean check2=true;
		
		
		count=pw.length();
		
		for (int i = 0; i < count; i++) {
			char ch=pw.charAt(i);
				if(Character.isUpperCase(ch)){
					upperCount++;
				}
				else if(Character.isDigit(ch)){
					digitCount++;
				}
				else if(Character.isWhitespace(ch)){
					check2=!check2;
					break;
				}
		}
		
		if(upperCount>1&&lowerCount>1&&digitCount>1&&count>7&&check){
			System.out.println("ok");
		}
		else{
			System.out.println("fail");
		}
		
		
		
		
		
	
		
			
		
		
		
	}
}	
