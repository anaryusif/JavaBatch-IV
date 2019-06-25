package com.class24;

class A {
	A(){
		System.out.println(10);
	}
}

class B extends A {
	B(){
		System.out.println(20);
	}
}
class C extends B {
	C(){
		System.out.println(30);
	}
}

class Main{
	C obj=new C();
	  public static void main(String[] args) {
		  Main obj=new Main();
		  
	   
	  }
	}