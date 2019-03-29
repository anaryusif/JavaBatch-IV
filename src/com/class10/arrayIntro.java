package com.class10;

public class arrayIntro {
public static void main (String[] args) {
	int[] array;
	array=new int[4];
	array[0]=10;
	array[1]=20;
	array[2]=30;
	array[3]=40;
	System.out.println(array[1]);
	
	int[] number=new int[5];
	number[0]=5;
	number[1]=15;
	number[2]=25;
	System.out.println(number[2]);
	int [] num= {1,2,3,4};
	System.out.println(num[2]);
	
	String[] names= {"adam","mike","john", "jane"};
	System.out.println("there are " +names.length+ " in the names");
    System.out.println(names[2]);
}
}
