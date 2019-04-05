package com.class16;

public class car {

	String make, model, color;
	int door, wheel;
public static void main(String[] args) {
	car car1=new car();
	
	car1.make="honda";
	car1.model="Civic";
	car1.color="Blue";
	car1.door=4;
	car1.wheel=2;
	car1.drive();
	car1.reverse();
	car car2=new car();
	car2.make="white";
	car2.model="Tesla";
	car2.color="black";
	car2.door=4;
	car2.wheel=2;
	car2.drive();
	car2.reverse();
}
void drive () {
	System.out.println("car can reverse");
}
void reverse () {
	System.out.println(" can can reverse");
}
}
	


