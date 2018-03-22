package com.iu.lang.wrapper;

public class Wrapper_test2 {
	public static void main(String[] args) {
		int num=10;
		String s="5";
		Integer integer=new Integer(num);	//생성자에 대입하면 Wrapper클래스로 리턴.
		Integer integer2=new Integer(s);	//문자열도 가능함.
		
		Double double1=new Double(num);		//
		
		System.out.println(integer.intValue()*10);	
		System.out.println(integer2.intValue()*10);
		System.out.println(Integer.toBinaryString(num));	//10진수를 2진수로 변경 
		System.out.println(Integer.toBinaryString(-1));	//10진수를 2진수로 변경 
		
		s="8788948462468538358";
		int num2=Integer.parseInt(s);		
		System.out.println(num2);

	}
}
