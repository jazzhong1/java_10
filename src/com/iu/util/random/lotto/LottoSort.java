package com.iu.util.random.lotto;

public class LottoSort {

	public Lotto[] sort(Lotto[] lotto) {

		int num[];
		for (int i = 0; i < lotto.length; i++) {
			num = lotto[i].getLotto();
			for (int j = 0; j < num.length; j++) {
				for (int j2 = j + 1; j2 < num.length; j2++) {
					if (num[j] > num[j2]) {
						int temp = num[j];
						num[j] = num[j2];
						num[j2] = temp;
					}

				}
			}
			LottoDataBase.lottoArray[i].setLotto(num);
		}
		return LottoDataBase.lottoArray;
	}

	public int[] sort(int[] result) {

		for (int j = 0; j < result.length; j++) {
			for (int j2 = j + 1; j2 < result.length; j2++) {
				if (result[j] > result[j2]) {
					int temp = result[j];
					result[j] = result[j2];
					result[j2] = temp;
				}

			}
		}
		return result;
	}

}
