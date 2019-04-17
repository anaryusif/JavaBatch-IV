package com.class22;

public class ConstructorTypes {
 ConstructorTypes() {
	System.out.println("I am a constructor with no parameters");
}
	
  ConstructorTypes(String str) {
	  System.out.println("I am a constructor with a parameter "+str);
  }
  ConstructorTypes(String str1, String str2) {
	  System.out.println("I am a constructor with a parameter "+str1+" "+str2);
  }
	public static void main(String[] args) {
		ConstructorTypes obj=new ConstructorTypes("anar", "adam");
		ConstructorTypes obj1=new ConstructorTypes("anar");
		
	}
}

