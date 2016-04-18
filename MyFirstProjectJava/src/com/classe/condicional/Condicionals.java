package com.classe.condicional;

public class Condicionals {

	int num1,num2;
	public String operator;
	
	public Condicionals(){
		this.num1 = 6;
		this.num2 = 3;
		this.operator = "+";
	}
	
	public Condicionals(String operator){
		this.num1 = 6;
		this.num2 = 3;
		this.operator = operator;
	}
	public Condicionals(int num1, int num2, String operator){
		this.num1 = num1;
		this.num2 = num2;
		this.operator = operator;
	}
	
	public void compare(){
		if(num1>num2) System.out.println("el numero 1 es el mes gran");
		else if (num1<num2) System.out.println("el numero 2 es el mes gran");
		else System.out.println("els dos nombres son iguals");
	}
	
	public void operate(){
		if (this.operator.equals("+")) System.out.println(this.num1+this.num2);
		else if (this.operator.equals("-")) System.out.println(this.num1-this.num2);		
	}

}
