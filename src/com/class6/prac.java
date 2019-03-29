package com.class6;

import java.util.Scanner;

public class prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner word=new Scanner (System.in);
		System.out.println("Please enter two words");
		String word1=word.nextLine();
		String word2=word.nextLine();
		Scanner num=new Scanner(System.in);
		System.out.println("Please enter two numbers");
		int num1=num.nextInt();
		int num2=num.nextInt();
		if (num1==num2 && word1==word2){
		System.out.println("AND");
		}if (num1==num2 || word1==word2) {
		System.out.println("OR");
		} else   {
		   System.out.println("NONE");
}
}	}