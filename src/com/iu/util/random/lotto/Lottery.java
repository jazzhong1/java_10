package com.iu.util.random.lotto;

public class Lottery {
	private Lotto lotto;
	
	public Lottery() {
		lotto=new Lotto();
	}
	
	
	
	
	public void check(){
		int num1[];
		int num2[];
		int num3[];
		int count=0;
	
		num3=new int[lotto.getCount()];
		
		num1=LottoDataBase.lottoResult[0].getLotto();
		for (int i = 0; i < LottoDataBase.lottoArray.length; i++) {
			num2=LottoDataBase.lottoArray[i].getLotto();
			for (int j = 0; j < num1.length; j++) {
				for (int j2 = 0; j2 < num2.length; j2++) {
					if(num1[j2]==num2[j]){
						count++;
					}
					
				}

				if(count==6){
					count=1;
				}
				else if(count==5){
					count=2;
				}
				else if(count==4){
					count=3;
				}
				else if(count==3){
					count=4;
				}
				else{
					count=0;
				}
				
				LottoDataBase.lottoArray[i].setRank(count);
			}
			
		}
		
	}

}
