package com.iu.util.random.lotto;

import java.util.*;

public class LottoRandom {
	private Random random;
	private Lotto lottos;
	
	public LottoRandom() {
		random=new Random();
		lottos=new Lotto();
	}

	public int[] random(int count){
		
		int[] lotto=new int[6];
		
		for (int i = 0; i < count; i++) {
			Random random = new Random();
			int num = random.nextInt(45) + 1;
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
		lottos.setResult(lotto);
//		return LottoDataBase.lottoArray;
		return lotto;
		
	}
}
