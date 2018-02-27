package com.iu.s1;

public class String_test4 {
	/**
	 * 원하는 문자인덱스~인덱스까지 저장할수있다. 
	 * 특정 문자열인덱스부터도 저장할수있다.
	 */

	public static void main(String[] args) {
		String n="oracle";
		String result=n.substring(2);	//시작번호부터 끝까지를 짤라오겠다.
		System.out.println(result);
		n="bugerking";
		result=n.substring(0, 5);		//Endindex는 포함되지 않는다 
										//start이상 endindex미만
		System.out.println(result);		//확장자명 짜를때 사용
		
		
		n=" buger king";	//앞뒤로 스페이스가 있을경우
							//문자열 내용이같아도 힙영역에 다르게 저장된다.
		
		
		System.out.println(n.equals("bergerking"));
		String n2=n.trim();
		System.out.println("Test"+n+"price");

		System.out.println("Test"+n2+"price");
		
		n=String.valueOf(020);	//String 형태로 바꿔준다.
		System.out.println(n);
	}
}
