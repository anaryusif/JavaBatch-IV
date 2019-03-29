package com.review2;

import java.util.Scanner;

public class reveiw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner temp=new Scanner (System.in);
System.out.println("Please enter teprature");
int num=temp.nextInt();
if (num>100) {
System.out.println("Stay inside");
}else if (num>=50 && num<99) {
System.out.println("wear summer cloth");	
}else if (num>30 && num<49) {
System.out.println("wear winter cloth");	
}else if (num>10 && num<29) {
System.out.println("it is too cold");
}else if (num<10) {
System.out.println("call help");	
}
	}

}
