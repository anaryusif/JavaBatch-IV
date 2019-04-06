package com.class17_2;

import java.util.Scanner;

public class scannerMethods {

	public static void main(String[] args) {
		scannerMethods total=new scannerMethods();
		Scanner input=new Scanner(System.in);
	    int a=input.nextInt();
	    int b=input.nextInt();
	    total.sum(a, b);
	   
	
	} void sum(int a, int b){
		
		System.out.println(a+b);
		
	}

}
