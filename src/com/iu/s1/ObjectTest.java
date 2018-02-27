package com.iu.s1;

public class ObjectTest {

	public static void main(String[] args) {
		Object object=new Object();
//		Object o=object.clone(); 메소드 접근제한자 protected	상속관계에서만가능하다. 
		Object obj1=new Object();
		Object obj2=new Object();
		
		boolean result=obj1.equals(obj2);
		
		//obj1==obj2;
		
		String s=obj1.toString();
		System.out.println(s);
		
		// getClass().getName() + '@' + Integer.toHexString(hashCode())
										//10진수를 16진스로 바꾸는 코드
		
		//java.lang.Object@36aa7bc2  	로 출력된다.
		System.out.println(obj1);
		//참조변수를 print하면 
		//내부에서 해당클래스의 toString 이란 메서드가 자동으로 호출된다.
		
		int i=obj1.hashCode();	//주소값번지수를 10진수로 나타낸것
								//보안에서 사용됨
		System.out.println(i);


		
	}	
}
