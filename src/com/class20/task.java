package com.class20;

public class task {
	String reverseString (String str) {
  String reversed="";
		for (int i=str.length()-1; i<=0; i--) {
			reversed=reversed+str.charAt(i);
			
	
		}
		System.out.println(reversed);
		return reversed;
	}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			
}
	}


