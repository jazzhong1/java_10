package com.iu.s1;

public class String_test3 {

	public static void main(String[] args) {
		String s= "iu,suji,choa,hani";
		
		String[] r=s.split(",");
		
		for (String a:r) {	//향상for문	배열의 길이만큼 알아서 돌아간다.
							//배열에서 하나를 뽑아 사용할때 
			System.out.println(a);
		}

	}

}
