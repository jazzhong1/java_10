package com.iu.util.random.lotto;

public class LottoSort {
	
	
	
	
	public void sort(int[] lotto){
		for (int i = 0; i < lotto.length; i++) {
			for (int j = i+1; j < lotto.length; j++) {
				if(lotto[i]>lotto[j]){
					int temp=lotto[i];
					lotto[i]=lotto[j];
					lotto[j]=temp;
				}
				
			}
		}
	}

}
