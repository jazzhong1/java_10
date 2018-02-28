package com.iu.util.random.lotto;

public class LottoView {
	
	public void view(int lotto[],int result[]){
		int count=0;
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < result.length; j++) {
				if(lotto[i]==result[j]){
					count++;
				}
			}
		}
	}

}
