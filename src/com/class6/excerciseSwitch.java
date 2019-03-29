package com.class6;

import java.util.Scanner;

public class excerciseSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
System.out.println("Please eneter your grade");
String grade=sc.nextLine();
switch (grade) {
case "A":
	System.out.println("Excelent");
break;
case "B":
	System.out.println("Good");
break;
case "C":
	System.out.println("average");
break;
case "d":
	System.out.println("bad");
default:
	System.out.println("any other grade is unaceptable");
}

	}

}
