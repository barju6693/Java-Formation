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
	
	public void showCarColour(){
		switch(this.color){
		case "blanc":
			System.out.println("El color es: " + this.color);
			break;
		case "negre":
			System.out.println("El color es: " + this.color);
			break;
		case "vermell":
			System.out.println("El color es: " + this.color);
			break;
		case "groc":
			System.out.println("El color es: " + this.color);
			break;
		case "blau":
			System.out.println("El color es: " + this.color);
			break;
		default:
			System.out.println("No tenim el color al cataleg");
			break;
		}
	}
	
	public void carCruiseControl(int speed){
		if (speed<=60) System.out.println("LEEEEEENTOOOOOOOO!!!!!!!");
		else if (speed>60 && speed<=120) System.out.println("Vas bien");
		else System.out.println("A TOPEEEEEEEEEE!!!!!!!");
	}
}
