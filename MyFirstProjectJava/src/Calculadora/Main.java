package Calculadora;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculadora calc = new Calculadora();
	    System.out.println("VALUES: 25 , 5");
	    System.out.println("DIVISIO --> "+calc.div(25, 5));
	    System.out.println("SUMA --> "+calc.sum(25, 5));
	    System.out.println("MULTIPLICACIO --> "+calc.mult(25, 5));
	    System.out.println("RESTA --> "+calc.rest(25, 5));
	}

}
