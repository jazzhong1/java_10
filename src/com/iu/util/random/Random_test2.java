package com.iu.util.random;

import java.util.*;

public class Random_test2 {

	public static void main(String[] args) {
		// 로또 생성기
		// 1~45번 총 6개

		int[] lotto = new int[6];
		int num;

		for (int i = 0; i < lotto.length; i++) {
			Random random = new Random();
			num = random.nextInt(45) + 1;
			lotto[i] = num;
		}

		
		for (int i = 0; i < lotto.length; i++) {
			
			for (int j = i + 1; j < lotto.length; j++) {
				if (lotto[i] == lotto[j]) {
					j--;
					Random random = new Random();
					num = random.nextInt(45) + 1;
					lotto[j + 1] = num;
					continue;
				}

			}
		}

		for (int i = 0; i < lotto.length; i++) {
			System.out.println(lotto[i]);
		}

	}

}
