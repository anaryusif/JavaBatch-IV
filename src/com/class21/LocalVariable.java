package com.class21;

public class LocalVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="John";
System.out.println(name);
LocalVariable obj=new LocalVariable();
obj.hello(name);
obj.hello(name);
System.out.println(name);
	}
	public void hello(String name) {
		name="Jack";
		System.out.println("hello "+name);
	}

}
