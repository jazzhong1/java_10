package com.iu.util.random.lotto;

import java.util.*;

public class LottoController {
	private Scanner sc;
	private Lotto lotto;
	private LottoRandom lottoRandom;
	private LottoSort lottoSort;
	private LottoView lottoView;
	
	public LottoController() {
		
		lotto=new Lotto();
		lottoRandom=new LottoRandom();
		lottoSort=new LottoSort();
		lottoView=new LottoView();
		sc=new Scanner(System.in);
	}
	
	public void start(){
		System.out.println("로또프로그램");
		
		System.out.print("돈 입력:");
		if(lotto.setMoney(sc.nextInt())){

			lotto.setNmg(lotto.getMoney()%1000);
			lotto.setCount(lotto.getMoney()/1000);
			System.out.println("받은 돈:"+lotto.getMoney()+"원");
			System.out.println("거스름 돈:"+lotto.getNmg()+"원");
			LottoDataBase.lottoArray=lottoRandom.random(lotto.getCount());
			lottoView.view(LottoDataBase.lottoArray);
		}
		
		else{
			lottoView.view("돈이 부족합니다.");
		}
//		lottoSort.sort(LottoDataBase.lottoArray);
		
		
	}

}
