package com.classe.variables;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variables var = new Variables();
		Variables var1 = new Variables();
		Variables var2 = new Variables();
		
		
		var.color();
		var1.color();
		var2.color();
		
		System.out.println("----Canvi de variable de classe de red a Variable de classe----");
		// Canvi del atribut estatic
		
		Variables.Colour = "Variable de CLASSE";
		
		var.color();
		var1.colour = "green";
		var1.color();
		var2.colour = "white";
		var2.color();
		
	}

}
