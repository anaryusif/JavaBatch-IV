package com.review2;

import java.util.Scanner;

public class reveiw33 {

	public static void main (String[] args) {

		String car;
		String carOrigin;
		Scanner input=new Scanner (System.in);
		System.out.println("Please enter your favorit car");
		car=input.nextLine();
		switch (car) {
		case "BMW":
			 carOrigin = "german car";	
		break;
		case "Toyota":
			carOrigin = "japanese car";
		break;
		case "Masarti":
		carOrigin = "itatlian car";
		break;
		default:
			carOrigin = "unknown";
			break;
		}
		 System.out.println("my favorit car is "+carOrigin); 
		}
	}