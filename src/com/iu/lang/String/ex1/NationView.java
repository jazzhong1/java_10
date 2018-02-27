package com.iu.lang.String.ex1;

public class NationView {

	public void view(Nation[] nations) {

		for (Nation nation:nations) {
			System.out.println("=======================");
			System.out.println("나라:"+nation.getName());
			System.out.println("금메달:"+nation.getGold());
			System.out.println("은메달:"+nation.getSilver());
			System.out.println("동메달:"+nation.getBronze());
		}
	}
	
	public void view(Nation nations) {
			System.out.println("=======================");
			System.out.println("나라:"+nations.getName());
			System.out.println("금메달:"+nations.getGold());
			System.out.println("은메달:"+nations.getSilver());
			System.out.println("동메달:"+nations.getBronze());
	}
	
	public void view(String message){
		System.out.println(message);
	}
	
}
