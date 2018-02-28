package com.iu.util.random;

import java.util.*;

public class Random_test2 {

	public static void main(String[] args) {
		// 로또 생성기
		// 1~45번 총 6개
		// 집에가서 분리하기 
		// 돈받아서 번호 입력 1000원 이면 1번 

		int[] lotto = new int[6];
		int[] result={3,10,13,26,34,38};
		int num;
		int count=0;

		for (int i = 0; i < lotto.length; i++) {
			Random random = new Random();
			num = random.nextInt(45) + 1;
			if (i == 0) {
				lotto[i] = num;
			} else {
				lotto[i] = num;
				for (int j = 0; j < lotto.length; j++) {
					if(i==j){
						continue;
					}
					if (lotto[j] == lotto[i]) {
						j--;
						num = random.nextInt(45) + 1;
						lotto[j + 1] = num;
						continue;
					}
				}
			}
		}
		
		
		
		
		
		for (int i = 0; i < lotto.length; i++) {
			for (int j = i+1; j < lotto.length; j++) {
				if(lotto[i]>lotto[j]){
					int temp=lotto[i];
					lotto[i]=lotto[j];
					lotto[j]=temp;
				}
				
			}
		}
		
		
		
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < result.length; j++) {
				if(lotto[i]==result[j]){
					count++;
				}
				
			}
		}
			


		

		for (int i = 0; i < lotto.length; i++) {
			System.out.println(lotto[i]);
		}
		
		switch (count) {
		case 6:
			System.out.println("1등");
			break;
		case 5:
			System.out.println("2등");
			break;
		case 3:
			System.out.println("3등");
			break;
		case 2:
			System.out.println("4등");
			break;
		default:
			System.out.println("미당첨");
			break;
		}

		

	}

}
