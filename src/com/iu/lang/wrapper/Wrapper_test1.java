package com.iu.lang.wrapper;

public class Wrapper_test1 {
	public static void main(String[] args) {
		
		
		int num=Integer.BYTES;		//int가 차지하는 바이트 
		int max=Integer.MAX_VALUE;	//int의 최대값
		int min=Integer.MIN_VALUE;	//int 최소값
		int size=Integer.SIZE;		// 32비트
		
		System.out.println(num);
		System.out.println(max);
		System.out.println(min);
		System.out.println(size);
	}
}
