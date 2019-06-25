package com.class35;

import java.util.Scanner;

public class taskex {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Please enter your num");

		
		try {
			int num=obj.nextInt();
		}catch (Exception e) {
			e.getMessage();
		}

	}

}
