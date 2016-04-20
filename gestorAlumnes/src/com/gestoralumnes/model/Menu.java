package com.gestoralumnes.model;

import com.gestoralumnes.controller.*;
import com.gestoralumnes.vista.*;
import com.gestoralumnes.negoci.*;
import java.util.ArrayList;

public class Menu {

	public PrintScreen printS;
	public ReadInfo readI;
	public String resposta;
	public GestioAlumne gestAlu;
	public DAOalumnesArray bdAlu;
	
	
	public void launch(){
		this.printS = new PrintScreen();
		this.readI = new ReadInfo();
		this.gestAlu = new GestioAlumne();
		this.bdAlu = new DAOalumnesArray();
		this.printS.printInfo();
		this.resposta = readI.keybInput();
		tractaResposta(this.resposta);
		
	}
	
	public void tractaResposta(String resposta){
		
		do{
			switch(resposta){
			case "1":
				System.out.println("Alta alumne");
				this.printS.printEnterName();
				Alumne alu = new Alumne();
				alu.setName(readI.keybInput());
				this.bdAlu.altaAlumnes(alu);
				break;
			case "2":
				System.out.println("Baixa alumne");
				this.bdAlu.baixaAlumne(readI.keybInput());
				break;
			case "3":
				System.out.println("Mostrar alumne");
				this.printS.printAlumensList();
				break;
			case "4":
				System.out.println("Modificar alumne");
				this.bdAlu.modAlumne(readI.keybInput(),readI.keybInput());
				break;
			case "0":
				//System.exit(0);
				System.out.println("MERDA");
				break;
			default:
				System.out.println("Opcio no valida");
				break;
			}
			this.printS.printInfo();
			resposta = readI.keybInput();
			}while (!resposta.equals("0"));
		}
	
	
}
