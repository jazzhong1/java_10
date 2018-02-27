package com.iu.s2;

public class Test_1 {
	/**
	 * 시간당 급여가  7530원 		//인터페이스
	 	9~6					//시간입력
		6시 이후 초과근무 시급1.5배 
		주말근무 시급의 1.5배 
		4대보험 
		국민연금  급여0.015		//인터페이스 
		의료보험 급여 0.02		//공단에서 떼는걸로 
		산재보험 급여 0.005
		고용보험 급여 0.025
		
		알바 
		정직원 
	 */
	public static void main(String[] args) {
		int perHour=7530;
		int normalTime=8;
		int overTime=4;
		int weekTime=10;	//토일 합
		
		Salaray sal=new Salaray();
		Emp emp= new Emp();
		Insureance ins=new Insureance();
		View view=new View();
		emp.setNormalTime(normalTime);
		emp.setOverTime(overTime);
		emp.setWeekTime(weekTime);
		emp.setSal(sal.cal(emp));
		
		//국민연금
		double d=ins.ins1(emp.getSal());
		emp.setSal(d);
		
		//의료보험
		d=ins.ins2(emp.getSal());
		emp.setSal(d);
		
		//산재보험
		emp.setSal(ins.ins3(emp.getSal()));
		
		//고용보험
		emp.setSal(ins.ins4(emp.getSal()));	//emp.setsal 주기만하면 출력가능
		
		view.view(emp);
		
		
	}
}
