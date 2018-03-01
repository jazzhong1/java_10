package com.iu.util.random.lotto;

import java.util.*;

public class LottoRandom {
	private Random random;
	private Lotto lottos;
	
	public LottoRandom() {
		random=new Random();
		lottos=new Lotto();
	}

	public Lotto[] random(int count){
		
		LottoDataBase.lottoArray=new Lotto[count];
		
		for (int i = 0; i < count; i++) {
			LottoDataBase.lottoArray[i]=new Lotto();
			int[] lotto=new int[6];
			for (int j = 0; j < lotto.length; j++) {
					lotto[j]=random.nextInt(45)+1;
				for (int j2 = 0; j2 < j; j2++) {
					if(lotto[j]==lotto[j2]){
						j--;
						break;
					}
				}
			}
			LottoDataBase.lottoArray[i].setLotto(lotto);
		}
		return LottoDataBase.lottoArray;
		
	}
}
