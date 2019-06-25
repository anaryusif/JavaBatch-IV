package com.class35;

public class catchException {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		
		try {
			int c=a/b;
			System.out.println(c);	
	} catch(ArithmeticException e) //we can just write Exception, it should be enough
		{
		System.out.println("This where we catch exceptions");
		}
		
		
	}

}
