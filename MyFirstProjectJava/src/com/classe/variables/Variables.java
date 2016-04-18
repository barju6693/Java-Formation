package com.classe.variables;

public class Variables {
	
	String colour = "blue";
	static String Colour = "red"; // es de classe 
	public short sou;
	
	public Variables(){
		this.sou=1600;
	}
	
	/**
	 * this method prints, hello world in terminal
	 */
	public void holaMundo(){
		System.out.println("Hello world");
	}
	
	public void color(){
		System.out.println(this.colour);
		System.out.println(this.Colour);
	}

}
