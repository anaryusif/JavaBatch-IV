package com.class10;

import java.util.Scanner;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int year;
Scanner scan;
scan=new Scanner(System.in);
System.out.println("Please enter the year");
year=scan.nextInt();

if (year%4==0 || year%400==0) {
	System.out.println("year is a leap year");
}else
	System.out.println("year is not leap year");
	}
}
