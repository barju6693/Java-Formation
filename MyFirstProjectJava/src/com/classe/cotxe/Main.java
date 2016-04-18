package com.classe.cotxe;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cotxe car = new Cotxe();
		System.out.println("Car");
		car.printCar();
		car.setColour("vermell");
		car.printCar();
		car.carCruiseControl(90);
		car.showCarColour();
		
		Cotxe car1 = new Cotxe("blau","Gasolina");
		System.out.println("Car 1");
		car1.printCar();
		car1.carCruiseControl(15);
		car1.showCarColour();
		
		Cotxe car2 = new Cotxe("foforito","Gasolina");
		System.out.println("Car 2");
		car2.printCar();
		car2.carCruiseControl(2500);
		car2.showCarColour();
	}

}
