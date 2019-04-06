package com.class17_2;

import java.util.Scanner;

public class practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan;
String item;
double price;
double payment;
double balance;
double totalPayment = 0;

scan=new Scanner(System.in);
System.out.println("Please enter your item");
item=scan.nextLine();
System.out.println("Please enter the item price");
price=scan.nextDouble();
do {
	System.out.println("Please enter your payment");
	payment=scan.nextDouble();
	totalPayment=totalPayment+payment;
	balance=price-totalPayment; 
	System.out.println("please enter more $ "+ balance);
} while (balance!=price);
System.out.println("Thanks for shopping with us");
	}

}
