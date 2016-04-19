package com.classe.controller;

import com.classe.vista.ImprimirPantalla;
import com.classe.vista.Llegir;

public class MenPrinc {

	public void launch(){
		ImprimirPantalla imp = new ImprimirPantalla();
		Llegir read = new Llegir();
		imp.printInfo();
		String resposta = read.keybInput();
		tractaResposta(resposta);
		
	}
	
	public void tractaResposta(String resposta){
		
		do{
			switch(resposta){
			case "1":
				System.out.println("Alta alumne");
				break;
			case "2":
				System.out.println("Baixa alumne");
				break;
			case "3":
				System.out.println("Mostrar alumne");
				break;
			case "4":
				System.out.println("Modificar alumne");
				break;
			case "0":
				System.exit(0);
				break;
			default:
				System.out.println("Opcio no valida");
				break;
			}
			ImprimirPantalla imp = new ImprimirPantalla();
			Llegir read = new Llegir();
			imp.printInfo();
			resposta = read.keybInput();
			}while (!resposta.equals("0"));
		}
}
