package com.class4;

import java.util.Scanner;
public class scannerIf {

	public static void main(String[] args) {

int number=20;
Scanner imput=new Scanner (System.in);
number=imput.nextInt();
if (number%2==0) {
	System.out.println("number is EVEN");
	
} else {
	System.out.println("number is ODD");
}
}
}