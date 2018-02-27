package com.iu.s1;

import java.util.*;

public class String_test2 {

	public static void main(String[] args) {
		String s = "iu"; // new연산자로 접근하지안고 상수를 집어넣는다.
		String str = "iu"; // heap영역에 iu상수가 있다면 참조한다.

		String str1 = new String("iu"); // 객체생성후 주소값에 대입
		String str2 = new String("iu"); // 동일
		Object obj1 = new Object();
		Object obj2 = new Object();

		System.out.println(obj1.equals(obj2)); // 주소값을 비교한다.

		System.out.println(s.equals(str)); // 문서상의 equals //속성값이 같은지 물어본다.
		System.out.println(s == str); // 주소값을 비교한다.
		System.out.println(obj1);
		System.out.println(obj2);

		String s3 = "seoulhellow";
		// 해당 문자가 몇변 인덱스에 있는지
		// 문자열에 해당문자가 2개 중첩될경우 가장가까운 인덱스 만 출력한다.
		boolean check = true;
		int count = 0;
		int a = 0;

		while (check) {
			a= s3.indexOf('l', a);
			if (a != -1) {
				count++;
				a++;
			} else {
				check = !check;
			}
		}
		System.out.println(count);
		
		
		s3="LGNoteBoook";
		a=s3.indexOf("Note");
		System.out.println(a);
		
		String[] files= {"jpg","png","gif"};
		s3="suji.iu.gif";		//확장자 명을찾을때 주로 lastindexof를 사용한다.
		//이미지 파일이니 아니니 판단

		//9.47, 8.98
		//9_58, 3_87
		s3=s3.replace('.', '_');	//특정문자를 다른 문자로 바꿔서 String로 리턴
		System.out.println(s3);
		
		
		
		
	}
}
