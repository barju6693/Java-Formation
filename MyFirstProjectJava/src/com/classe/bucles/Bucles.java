package com.classe.bucles;

public class Bucles {

	public void count(int num1, int num2){
		// entra dos nombres i compto quant n'hi ha pel mig
		int counter=0;
		for (int i=num1;i<num2;i++){
			counter++;
		}
		System.out.println("Hi han "+counter+" nombres");
	}
	
	public void mentre(int num1, int num2){
		int counter=0;
		while(num1<num2){
			num1++;
			counter++;
		}
		while(num2<num1){
			num2++;
			counter++;
		}
		System.out.println("Hi han "+counter+" nombres");
	}
	
	public void fesMentre(int num1, int num2){
		int counter=0;
		do{
			num1++;
			counter++;
		}while(num1<num2);
		
		if(num1>num2){
			counter=0;
			num1--;
		}
		
		do{
			num2++;
			counter++;
		}while(num2<num1);
		System.out.println(counter);
	}
	
	public void multFor(int mult){
		int arr[] = new int[11];
		for (int i=0; i<11;i++){
			arr[i]=i*mult;
		}
		for(int x : arr){
			System.out.println(x);
		}
	}
	
	public void multWhile(int mult){
		int i=0;
		while (i<11){
			System.out.println(i*mult);
			i++;
		}
	}
	
}
