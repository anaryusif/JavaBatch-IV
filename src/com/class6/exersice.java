package com.class6;

import java.util.Scanner;

public class exersice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your country");
		String country=scan.nextLine();
		String language;
switch (country) {
case "USA":	
language="english";
break;
case "France":
language="french";
break;
default:
language="unknown";
}	
System.out.println("your language is " +language);
}
		
		
		
	}
