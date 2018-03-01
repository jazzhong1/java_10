package com.iu.util.random.lotto;

public class Lotto {
	
	private int money;
	private int[] lotto;
	private int count;
	private int nmg;
	private int rank;
	
	public Lotto() {
	}
	
	
	public int getMoney() {
		return money;
	}
	public boolean setMoney(int money) {
		if(money>1000){
			this.money = money;
			return true;
		}
		return false;
	}
	public int[] getLotto() {
		return lotto;
	}
	public void setLotto(int[] lotto) {
		this.lotto = lotto;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count=count;
	}
	public int getNmg() {
		return nmg;
	}
	public void setNmg(int nmg) {
		this.nmg = nmg;
	}


	public int getRank() {
		return rank;
	}


	public void setRank(int rank) {
		this.rank=rank;
		
	}

}
