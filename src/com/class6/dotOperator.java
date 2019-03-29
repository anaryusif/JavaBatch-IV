package com.class6;

import java.util.Scanner;

public class dotOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan;
String country;
String favoritFood;
scan=new Scanner(System.in);
System.out.println("Please enter your country");
country=scan.nextLine();
switch (country){
case "USA":
favoritFood="Burger";
    break;
case "Afghanistan":
    favoritFood="Palau";
    break;    
case "Russia":
    favoritFood="Pelmeni";
    break;
case "Italy":
    favoritFood="Pasta";
    break;
case "Turkey":
    favoritFood="Baklava";
    break;
case "Morocco":
    favoritFood="Couscous";
    break;
case "Kazakhstan":
    favoritFood="Beshparmak";
    break;
case "Pakistan":
    favoritFood="Biryani";
    break;
default:
    favoritFood="Unknown";
}
System.out.println("Your favorite food is "+favoritFood);

	}

}
