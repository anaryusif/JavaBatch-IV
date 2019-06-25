package com.class26;

public class A {
public void method() {
	System.out.println("Main method");
}
}
class B extends A{
		
public void	method() {
	super.method();	
		System.out.println("my second method");
	}
}