package com.classe.menu;

/**
 * Imprimir per pantalla els elems de l'aplicacio
 * @author usuario
 *
 */

public class PrintScreen {
	
	public void printInfo(){
		//mostrar per stdin les opcions del menu
		System.out.println("Alta alumnes --> 1\n"
				+ "Baixa alumne --> 2\n"
				+ "Mostrar alumnes --> 3"
				+ "\nModificar alumne --> 4 \n"
				+ "Exit --> 0");
	}
}
