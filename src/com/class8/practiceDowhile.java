package com.class8;

import java.util.Scanner;

public class practiceDowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan;
double price;
scan=new Scanner(System.in);

do {
	System.out.println("Please pay for the soda");
	price=scan.nextDouble();
	
} while(price!=1.99);
System.out.println("please enjoy your soda");

	}

}
