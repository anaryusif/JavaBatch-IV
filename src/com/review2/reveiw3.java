package com.review2;

import java.util.Scanner;

public class reveiw3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your 1-7 numbers");
		int num=scan.nextInt();
		String day;
switch (num) {
case 1:	
day="Monday";
break;
case 2:
	day="Tuesday";
	break;
case 3:
	day="Wednesday";
break;
case 4:
	day="Thursday";
break;
case 5:
	day="Friday";
	break;
case 6:
	day="Saturday";
case 7:
	day="Sunday";
default:
day="unknown";
}	
System.out.println("Day of the week is " +day);
	}
}
