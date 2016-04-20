package com.gestoralumnes.vista;

import com.gestoralumnes.model.DAOalumnesArray;
import com.gestoralumnes.negoci.Alumne;

public class PrintScreen {

	public void printInfo(){
		//mostrar per stdin les opcions del menu
		System.out.println("Alta alumnes --> 1\n"
				+ "Baixa alumne --> 2\n"
				+ "Mostrar alumnes --> 3"
				+ "\nModificar alumne --> 4 \n"
				+ "Exit --> 0\n"
				+"Entra la opcio:");
	}
	
	public void printAlumne(Alumne alumne){
		System.out.println(alumne.getName());
	}
	
	public void printEnterName(){
		System.out.println("Entra el nom de l'alumne:");
	}
	
	public void printAlumensList(){
		DAOalumnesArray bd = new DAOalumnesArray();
		System.out.println("-------LIST--------");
		for (Alumne alu : bd.getAlumnesList()){
			System.out.println(alu.getName());
		}
		System.out.println("-------LIST--------");
	}
}
