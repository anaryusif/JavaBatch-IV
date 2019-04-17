package com.class22; 

public class Car {
String make; //unknown
String model; //unkown
int numberOfdoors; //4
int topSpeed; //90
int price;
Car (String make, String model, int numberOfdoors,int topSpeed,int price ) {
	System.out.println(make+" "+model+" "+numberOfdoors+" "+topSpeed+" "+price);
}
Car (String make, String model,int topSpeed,int price ){
	System.out.println(make+" "+model+" "+topSpeed+" "+price);
}
Car (String make,int topSpeed,int price ){
	System.out.println(make+" "+topSpeed+" "+price);
}	
Car (String make){
	System.out.println(make);
		
	}
}
