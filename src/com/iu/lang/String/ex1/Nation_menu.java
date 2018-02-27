package com.iu.lang.String.ex1;

import java.util.*;

public class Nation_menu {
	private Scanner sc;
	private NationDate nationDate;
	private NationView nationView;
	private Nation_serarch nation_serarch;
	private Nation nation;
	private Nation[] nations;
	
	public Nation_menu() {

			sc=new Scanner(System.in);
			nationDate=new NationDate();
			nationView=new NationView();
			nation_serarch=new Nation_serarch();
			nations=nationDate.makeNation();
	}

	public void start(){
		
		//1.나라정보출력
		
		//2.나라정보 검색
			//검삭할 나라 이름을 입력하세요
			//nationSearch  serch메서드 
			
			//나라이름 메달 정보
		
		//3.프로그램종료
		

		boolean check=true;
		
		while(check){
			System.out.println("1.나라정보출력|2.나라검색|3.종료");
			int num=sc.nextInt();
			
			switch (num) {
			case 1:
				System.out.println("나라정보출력");
				nationView.view(nations);
				
				break;
				

			case 2:
				System.out.println("나라이름 검색");
				nation=nation_serarch.search(nations);
				if(nation!=null){
					nationView.view(nation);
				}
				else{
					nationView.view("나라가 없습니다.");
				}
				break;

			case 3:
				check=!check;
				break;
			}
			
			
		}
		System.out.println("종료");
	}
}
