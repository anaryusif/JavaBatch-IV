package com.class14;

public class substringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="Sunday is fun day";
String rev="";
for (int i=name.length(); i>0; i--) {
rev=rev+name.substring(i-1, i);
	
	}
System.out.println(rev);
String [] array=name.split(" ");
for (String name1:array) {
	System.out.print(name1+" ");
	
}

	}}
