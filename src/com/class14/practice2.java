package com.class14;

public class practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="I am a systex student";
String b=a.replace(" ", "");
System.out.println(b);



//Create a String that should be combination of letters, numbers and special characters. Find out how many alpha characters are there in the String.
String com="hello 1323 %^&%^";
String com1=com.replaceAll("[0-9 A-Z a-z]", "");
System.out.println(com1.length());








	}

}
