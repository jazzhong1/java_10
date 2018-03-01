package com.iu.util.random.lotto;

import java.util.*;

public class LottoRandom {
	private Random random;
	private Lotto lottos;
	private Calendar calendar;

	public LottoRandom() {
		lottos = new Lotto();
		calendar=Calendar.getInstance();
	}

	public Lotto[] random(int count) {

		LottoDataBase.lottoArray = new Lotto[count];
		random = new Random(calendar.getTimeInMillis());

		for (int i = 0; i < count; i++) {
			LottoDataBase.lottoArray[i] = new Lotto();
			int[] lotto = new int[6];
			for (int j = 0; j < lotto.length; j++) {
				lotto[j] = random.nextInt(45) + 1;
				for (int j2 = 0; j2 < j; j2++) {
					if (lotto[j] == lotto[j2]) {
						j--;
						break;
					}
				}
			}
			LottoDataBase.lottoArray[i].setLotto(lotto);
		}
		return LottoDataBase.lottoArray;

	}
	
	public Lotto[] random() {

		LottoDataBase.lottoResult = new Lotto[1];
		random = new Random(calendar.getTimeInMillis());

		for (int i = 0; i < 1; i++) {
			LottoDataBase.lottoResult[i] = new Lotto();
			int[] lotto = new int[6];
			for (int j = 0; j < lotto.length; j++) {
				lotto[j] = random.nextInt(45) + 1;
				for (int j2 = 0; j2 < j; j2++) {
					if (lotto[j] == lotto[j2]) {
						j--;
						break;
					}
				}
			}
			LottoDataBase.lottoResult[0].setLotto(lotto);
		}
		return LottoDataBase.lottoResult;

	}

}
