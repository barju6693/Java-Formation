package com.gestoralumnes.model;

import com.gestoralumnes.negoci.*;
import java.util.ArrayList;

public class DAOalumnesArray {

	public static ArrayList<Alumne> list = new ArrayList<Alumne>();
	
	public void altaAlumnes(Alumne alu){
		list.add(alu);
	}
	
	public void baixaAlumne(String name){
		Alumne alu = new Alumne();
		alu.setName(name);
		if (list.contains(alu)){
			list.remove(alu);
		}
	}
	
	public void modAlumne(String oldName, String newName){
		Alumne alu = new Alumne();
		alu.setName(oldName);
		if(list.contains(alu)){
			baixaAlumne(oldName);
			alu.setName(newName);
			altaAlumnes(alu);
		}
	}
	
	public ArrayList<Alumne> getAlumnesList(){
		return list;
	}
	
}
