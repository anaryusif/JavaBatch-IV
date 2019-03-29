package com.class5;

import java.util.Scanner;

public class exersice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner (System.in);
System.out.println("please enter your height");
int height=input.nextInt();
if (height<5  ) {
System.out.println("short");
}else if (height==5 && height>=6) {
	System.out.println("medium");
}
if (height>=6)	
	System.out.println("tall");
	}
	}


