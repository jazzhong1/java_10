package com.iu.util.random.lotto;

public class Lottery {
	private Lotto lotto;

	public Lottery() {
		lotto = new Lotto();
	}

	public int[] check(int[] result) {
		int num1[];
		int num2[];
		int num3[];
		int count = 0;
		int count2 = -1;

		num3 = new int[LottoDataBase.lottoArray.length];
		num1 = result;
		for (int i = 0; i < LottoDataBase.lottoArray.length; i++) {
			num2 = LottoDataBase.lottoArray[i].getLotto();
			for (int j = 0; j < num2.length; j++) {
				for (int j2 = 0; j2 < num1.length; j2++) {
					if (num1[j] == num2[j2]) {
						count++;
					}
				}

				if (count == 6) {
					count = 1;
				} else if (count == 5) {
					count = 2;
				} else if (count == 4) {
					count = 3;
				} else if (count == 3) {
					count = 4;
				} else {
					count = 0;
				}

			}

			num3[i] = count;
		}

		return num3;

	}

}
