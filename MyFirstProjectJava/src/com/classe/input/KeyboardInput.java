package com.classe.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardInput {

	public KeyboardInput(){
		
	}
	
	public String keybInput(){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bfr = new BufferedReader(isr);
		String str = "";
		try{
			str = bfr.readLine();
		}
		catch(IOException e){
			e.getMessage();
		}
		return str;
	}
	
	public void print(String str){
		System.out.println(str);
	}
	
	public void threeInRow(){
		Boolean finished = false;
		while (!finished){
			keybInput();
			/*
			 * Logica de joc
			 */
		}
	}
	public void printMatrix(String[][] arr){
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}
}
