package com.classe.cotxe;

public class Cotxe {
	public String color;
	public String carburant;
	
	public Cotxe(){
		carburant = "Diesel";
		this.color = "Blanc";
	}
	
	public Cotxe(String color, String carburant){
		this.carburant = carburant;
		this.color = color;
	}
	
	/**
	 * This function changes the colour of that car
	 * @param colour : tipus String
	 */
	public void setColour(String colour){
		this.color = colour;
	}
	
	public void printCar(){
		System.out.println(carburant + " " + this.color);
	}
}
