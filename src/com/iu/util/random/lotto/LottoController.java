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
		sc=new Scanner(System.in);
	}
	
	public void start(){
		System.out.println("로또프로그램");
		
		System.out.println("돈 입력:");
		lotto.setMoney(sc.nextInt());
		lotto.setNmg(lotto.getMoney()%1000);
		lotto.setCount(lotto.getMoney()/1000);
		
		System.out.println(lotto.getCount());
		System.out.println(lotto.getNmg());
		
		
//		LottoDataBase.lottoArray=new Lotto[lotto.getCount()];
		
		
//		int[] lottos=new int[6];
		lottoRandom.random(lotto.getCount());
//		lottoSort.sort(LottoDataBase.lottoArray);
		
		
	}

}
