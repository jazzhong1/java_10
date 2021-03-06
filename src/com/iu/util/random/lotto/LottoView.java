package com.iu.util.random.lotto;

public class LottoView {

	public void view(Lotto[] lotto) {
		int num[];
		char a = 65;
		System.out.println("발급중.....");
		for (int i = 0; i < lotto.length; i++) {
			num = lotto[i].getLotto();
			a = (char) (a + i);
			System.out.print(a + ": ");
			for (int j = 0; j < num.length; j++) {
				System.out.print(num[j] + " ");
			}
			System.out.println();
		}
	}

	public void view(int[] result) {
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}

	public void view(String str) {
		System.out.println(str);
	}

	public int rank(int[] result) {
		int min = 0;
		
		for (int i = 0; i < result.length; i++) {
			min = result[i];
			if (result[i] < min) {
				min = result[i];
			}
		}
		return min;
	}

}
