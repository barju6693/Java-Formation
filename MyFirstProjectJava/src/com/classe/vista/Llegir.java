package com.classe.vista;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Llegir {

	public String keybInput(){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bfr = new BufferedReader(isr);
		String option ="";
		try{
			option = bfr.readLine();
		}
		catch(IOException e){
			e.getMessage();
		}
		return option;
	}
}
