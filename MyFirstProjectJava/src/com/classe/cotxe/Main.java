package com.classe.cotxe;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cotxe car = new Cotxe();
		System.out.println("Car");
		car.printCar();
		car.setColour("green");
		car.printCar();
		
		Cotxe car1 = new Cotxe("Blue","Gasolina");
		System.out.println("Car 1");
		car1.printCar();
		
	}

}
