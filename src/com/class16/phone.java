package com.class16;

public class phone {
String model, color;
int screenSize;


public static void main (String[] args) {

 phone	iphone=new phone();
	
 iphone.color="black";
 iphone.model="Iphone";
 iphone.screenSize=6;
 iphone.call();	
}
void call() {
	System.out.println("you can call");
}void takePics() {
	System.out.println("You can take pictures");
}
}