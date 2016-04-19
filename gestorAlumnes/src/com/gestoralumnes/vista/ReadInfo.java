package com.gestoralumnes.vista;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadInfo {

	public String keybInput(){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bfr = new BufferedReader(isr);
		String input ="";
		try{
			input = bfr.readLine();
		}
		catch(IOException e){
			e.getMessage();
		}
		return input;
	}
}
