package com.class4;

import java.util.Scanner;

public class scannerAndif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String cityName;

   Scanner myScanner=new Scanner(System.in);
   System.out.println("please enter your city");
   cityName=myScanner.nextLine();
   System.out.println("Please enter tempratura in Ferenheight");
   int temp=myScanner.nextInt();
    		int convertedTemp=(temp-32)*5/9;
    		
    		System.out.println("temprature in the city "+cityName+"is "+convertedTemp);
    
    		
    		
	}

}
