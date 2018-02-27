package com.iu.s2;

public class Insureance {

	// 국민연금계산
	public double ins1(double sal) {

		sal = sal - sal * 0.015;

		return sal;

	}

	public double ins2(double sal) {

		sal = sal - sal * 0.02;

		return sal;

	}

	public double ins3(double sal) {

		sal = sal - sal * 0.005;

		return sal;

	}

	public double ins4(double sal) {

		sal = sal - sal * 0.025;

		return sal;

	}

}
