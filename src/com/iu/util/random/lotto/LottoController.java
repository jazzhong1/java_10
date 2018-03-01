package com.iu.util.random.lotto;

import java.util.*;

public class LottoController {
	private Scanner sc;
	private Lotto lotto;
	private LottoRandom lottoRandom;
	private LottoSort lottoSort;
	private LottoView lottoView;
	private Lottery lottery;

	public LottoController() {

		lotto = new Lotto();
		lottoRandom = new LottoRandom();
		lottoSort = new LottoSort();
		lottoView = new LottoView();
		lottery = new Lottery();
		sc = new Scanner(System.in);
	}

	public void start() {
		System.out.println("로또프로그램");
		boolean check = true;
		while (check) {
			System.out.println("1.로또구매|2.당첨확인|3.종료");
			int num = sc.nextInt();

			switch (num) {
			case 1:
				System.out.print("돈 입력:");
				if (lotto.setMoney(sc.nextInt())) {

					lotto.setNmg(lotto.getMoney() % 1000);
					lotto.setCount(lotto.getMoney() / 1000);
					System.out.println("받은 돈:" + lotto.getMoney() + "원");
					System.out.println("거스름 돈:" + lotto.getNmg() + "원");
					LottoDataBase.lottoArray = lottoRandom.random(lotto.getCount());
					lottoSort.sort(LottoDataBase.lottoArray);
					lottoView.view(LottoDataBase.lottoArray);

				}

				else {
					lottoView.view("돈이 부족합니다.");
				}

				break;

			case 2:
				System.out.println("당첨번호:");
				int result[]=lottoRandom.random();
				lottoView.view(result);
				result=lottery.check(result);
				
				System.out.println(lottoView.rank(result) + "등 입니다.");
				break;

			case 3:
				check=!check;
				break;

			default:
				lottoView.view("다시입력하세요");
				break;
			}

		}

	}

}
