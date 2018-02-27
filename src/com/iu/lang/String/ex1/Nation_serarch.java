package com.iu.lang.String.ex1;

import java.util.*;

public class Nation_serarch {

	private Scanner sc;
	private Nation n=null;

	public Nation_serarch() {
		sc = new Scanner(System.in);
	}
	
	public Nation search(Nation[] nations){		//매개변수로 받아도댐
		System.out.print("나라이름:");
		String name=sc.next();
		
		for (Nation nation:nations) {
			if(name.equals(nation.getName())){
				n=nation;
			}
		}
		return n;
	}

}
