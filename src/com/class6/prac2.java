package com.class6;

import java.util.Scanner;

public class prac2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input;
		int num;
		String season="";
		input=new Scanner (System.in);
		System.out.println("Please enter your birthday month number");
		num=input.nextInt();
		if (num==12 || num==1 || num==2) {
		  season="Winter";
		}else if (num==3|| num==4 || num==5) {
		  season="Spring";
		}else if (num==6|| num==7 ||num==8){
		  season="Summer";
		}else if (num==9|| num==10 ||num==11) {
		  season="Fall";
		}else {
		  System.out.println("Please enter valid month number");
		  season="Unknown";
		}

		  System.out.println("You were born in "+season);
		  
		}  
		

	}


