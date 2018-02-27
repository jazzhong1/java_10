package com.iu.s1;

public class String_test5 {
	public static void main(String[] args) {
		String str1="iu";
		String str2="suji";
		
		
//		str1=str1+str2;		//String 주소값 불변성
							//iu값을 가지고오고, suji값을가지고와서
							//heap영역에 새로운 문자열을 만들어 주소값도 다른주소값이 str1에 대입된다.
							//String 클래스에스 +의 불필요함을 줄여야한다.
		
		
		StringBuffer sb=new StringBuffer();		//java.lang은 기본적으로제공하는 패키지이기때문에 그냥사용가능
		sb=sb.append(str1);		//문자열을 더해준다.
		sb=sb.append(str2);

		String s=sb.toString();	//toString() object메소드 
		System.out.println(sb);
		System.out.println(s);
		
		
		
		
		
	}
}
