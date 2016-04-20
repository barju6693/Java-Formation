package com.gestoralumnes.controller;

import java.util.ArrayList;

import com.gestoralumnes.model.DAOalumnesArray;
import com.gestoralumnes.negoci.Alumne;

public class GestioAlumne {

	public DAOalumnesArray dao;
	
	/*public GestioAlumne(){
		this.dao = new DAOalumnesArray();
	}*/
	
	public static void altaAlumnes(Alumne alu){
		DAOalumnesArray dao = new DAOalumnesArray();
		dao.altaAlumnes(alu);
	}
	
	public static void baixaAlumne(String name){
		DAOalumnesArray dao = new DAOalumnesArray();
		dao.baixaAlumne(name);
	}
	
	public void modAlumne(String oldName, String newName){
		DAOalumnesArray dao = new DAOalumnesArray();
		dao.modAlumne(oldName, newName);
	}
	
	public ArrayList<Alumne> getAlumnesList(){
		DAOalumnesArray dao = new DAOalumnesArray();
		return dao.getAlumnesList();
	}
}
