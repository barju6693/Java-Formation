package com.classe.condicional;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Condicionals cond = new Condicionals("+");
		cond.compare();
		cond.operate();
		System.out.println("---------");
		Condicionals cond1 = new Condicionals("-");
		cond1.operate();
		System.out.println("---------");
		Condicionals cond2 = new Condicionals(30,8,"+");
		cond2.compare();
		cond2.operate();
	}

}
