package com.iu.lang.wrapper;

public class Wrapper_test4 {

	public static void main(String[] args) {
		int num=10;		//숫자를 활용하려고할때 
		
		//boxing
		Integer n1=new Integer(num);		//Primitive->Reference
		
		//unboxing
		num=n1.intValue();						//언박싱
	
		//autoBoxing 
		n1=num;		//자동으로 사용하게 만들어놓음0
		
		//autoUnBoxing
		num=n1;				//		num=n1.intValue();						//언박싱과정이 필요없다.
		
		System.out.println(n1);
		System.out.println(num);
		
		double d=n1;			//auto되려면 int -> Integer 에서만 가능하다.
								//자동형변환 되기때문에 가능
		
		n1=(int)d;
		
		Double d1=d;
//		n1=d1;		//Reference끼리 캐스팅하면 안된다. 강제캐스팅도 안됨
		
		n1=(int)d1.doubleValue();
		
		String s="3";	//숫수하게 숫자만 들어가야지만 가능하다.
		

	}
}
