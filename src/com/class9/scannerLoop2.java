package com.class9;

import java.util.Scanner;

public class scannerLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String item;
		int price;
		
		Scanner shop=new Scanner (System.in);
		System.out.println("What item do you want to buy");
		item=shop.nextLine();
		System.out.println("Please pay for it");
		price=shop.nextInt();	
	}
			}

