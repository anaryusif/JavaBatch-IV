package com.class11;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] cars= {"kia", "bmw","jeep", "honda", "ford","lada"};
for (String car:cars) {
	System.out.print(car+" ");
}
String[] carss= {"kia", "bmw","jeep", "honda", "ford","lada"};
for (int i=0; i<carss.length; i++) {
	System.out.println(carss[i]);
System.out.println();	
}
String[]country= {"Russia","USA", "Azerbaijan"};
for (int i=0;i<country.length;i++) {    
    
switch(country[i]) {
case "Russia":
    System.out.println("Moscow");
    continue;
case"USA":
    System.out.println("Washington");
    continue;
case "Azerbaijan":
	System.out.println("Baku");
	break;
}

}}}