package com.iu.s2;

public class Salaray {
	
	private int perHour;
	
	public Salaray() {
		perHour=7530;
	}
	
	public double cal(Emp time){
		double sal=time.getNormalTime()*perHour;	//기본시간급여
		sal+=time.getOverTime()*1.5*perHour;		//시간의 종류가 많기때문에 클래스로 접근한다.
		sal+=time.getWeekTime()*1.5*perHour;
		
		
		return sal;
	}

}
