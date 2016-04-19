package com.classe.menu;
import com.classe.input.*;

public class Menu {

	KeyboardInput kb = new KeyboardInput();
	String option = kb.keybInput();
	String name = " ";
	
	public Menu(){
		
	}	
	
	switch (option){
		case "hello":
			System.out.println("Hello "+ name);
			break;
		case "bye":
			System.out.println("Good Bye  "+ name);
			break;
		case "exit":
			System.out.println("Exit "+ name);
			break;
	}
	
}
