package com.review2;

import java.util.Scanner;

public class review2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age;
String output;
Scanner input=new Scanner (System.in);
System.out.println("Please enter your age");
age=input.nextInt();
if (!(age>18)) {
	output="too young";
} else if (age>=18 && age<=35) {
	output="young person";
}else if (age>=36 || age<=99) {
	output="middle age";
}else {
	output="old";
}
System.out.println(output);
}}