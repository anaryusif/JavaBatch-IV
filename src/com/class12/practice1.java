package com.class12;

import java.util.Scanner;

public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Write a java program that prints out true if ( x * y ) return a positive value. Else prints out false if  (x * y) return a negative value.
	//Step 1: Your program should ask �Please enter first number� - for the 1st number and �Please enter second number�-for the 2nd number
	//Step 2: Create the if condition to check the X and Y value validation for the sign value
	//Step 3: If it is positive value user would get True if it negative value user would get false
  Scanner input=new Scanner (System.in);
  System.out.println("Please enter your first number");
  int x=input.nextInt();
  System.out.println("Please enter second number");
  int y=input.nextInt();
  int total=x*y;
  boolean negative=total<0;
  boolean positive=total>0;
  if (negative) {
	  System.out.println(negative);
  }else
  {System.out.println(positive);
  }
  
	}}
