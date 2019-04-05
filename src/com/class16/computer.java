package com.class16;

public class computer {
String  screen, ram, os, brand;
boolean mouse, keyboard;
public static void main (String [] args) {
	computer com=new computer();
	com.mouse=true;
	com.keyboard=false;
	com.screen="4";
	com.ram="6";
	com.os="Mac OS";
	com.brand="HP";
	
	com.comBrand();
	com.watchMovie();
	com.doJavaCoding();
	com.playMusic();
System.out.println(com.ram);	
}
void watchMovie() {
	System.out.println("we can watch movie on a computer " +brand);
}void doJavaCoding() {
	System.out.println("we can do java codding");
}void playMusic() {
	System.out.println("You can listen music");
}void comBrand() {
	System.out.println("Computer brand");
}
}

