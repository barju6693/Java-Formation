package com.classe.cotxe;

public class Cotxe {
	public static String color;
	public String carburant;
	
	public Cotxe(){
		this.carburant = "Diesel";
		color = "Blanc";
	}
	
	public void setColour(String colour){
		color = colour;
	}
	
	public void printCar(){
		System.out.println(this.carburant + " " + color);
	}
}
