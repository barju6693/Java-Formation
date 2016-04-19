package com.classe.menu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Llegeix {

	/*public Llegeix(){
		
	}*/
	
	public int keybInput(){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bfr = new BufferedReader(isr);
		int option=0;
		try{
			option = Integer.parseInt(bfr.readLine());
		}
		catch(IOException e){
			e.getMessage();
		}
		return option;
	}
}
