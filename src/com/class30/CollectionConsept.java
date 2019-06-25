package com.class30;

import java.util.ArrayList;

public class CollectionConsept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer integer1=new Integer(10);
System.out.println(integer1);
Integer integer2=20; //auto boxing
System.out.println(integer2);
int num=integer1.intValue();
System.out.println(num);
int num2=integer2; //auto unboxing
System.out.println(num2);
	
	ArrayList <Integer> myints=new ArrayList<Integer>();
	myints.add(10);
	myints.add(20);
	myints.add(30);
	myints.add(40);
	myints.set(2, 23323);
	
	for (int num1:myints) {
	
	System.out.println(num1);}
	}

}
