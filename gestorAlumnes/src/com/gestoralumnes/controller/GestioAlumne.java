package com.gestoralumnes.controller;

import java.util.ArrayList;

import com.gestoralumnes.negoci.Alumne;

public class GestioAlumne {

public ArrayList<Alumne> alumnes = new ArrayList<Alumne>();
	
	public void addAlumne(Alumne alumne){
		this.alumnes.add(alumne);
	}
	
	public void deleteAlumne(String name){
		
	}
	
	public void getAlumnes(){
		System.out.println("-------LIST--------");
		for(Alumne alu : this.alumnes){
			System.out.println(alu.getName());
		}
		System.out.println("-------LIST--------");
	}
}
