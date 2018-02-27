package com.iu.s3;

import java.util.*;

public class Menu {
	private Scanner sc;
	private Steak steak;
	private Pasta pasta;
	private SteakShef steakshef;
	private PastaShef pastaShef;
	private Customer customer;

	public Menu() {
		sc = new Scanner(System.in);
		steak = new Steak();
		pasta = new Pasta();
		steakshef = new SteakShef();
		pastaShef = new PastaShef();
		customer = new Customer();
	}

	public void start() {

		boolean check = true;

		while (check) {
			System.out.println("1.Steak|2.Pasta|3.Exit");
			System.out.print("choice:");
			int num = sc.nextInt();

			switch (num) {
			case 1:
				System.out.println("Steak");
				steak = steakshef.makeSteak();
				customer.eat(steak);
				break;

			case 2:
				System.out.println("Pasta");
				pasta = pastaShef.makePasta();
				customer.eat(pasta);
				break;

			default:
				System.out.println("집에가자 ");
				check = !check;
				break;
			}
		}
	}

}
