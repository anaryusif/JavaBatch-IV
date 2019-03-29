package com.class6;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
	Scanner scan=new Scanner (System.in);
	System.out.println("what is the temprature");
	int temp=scan.nextInt();
	
	boolean rain=true;
	boolean snow=true;
	boolean sunny=true;		
		if (temp>40 && temp<80) {
	        if (rain){
	            String activity="watch movie";            
	        }else {
	            String activity= "go hiking";
	        }
	}else if (temp >=25 && temp <40){
	    if (snow) {
	      String   activity="snowboarding";
	    }else {
	        String activity="do coding";
	    }
	}else if( temp >80){
	    if (sunny) {
	     String  activity="go to the beach";
	    }else {
	        String activity="more coding";
	    }
	   
	}else {
	    System.out.println("Please enter different temp");
	    System.out.println("activity");
	    String activity="Uknown";
	}}}