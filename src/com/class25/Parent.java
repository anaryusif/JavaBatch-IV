package com.class25;

public class Parent {

	Parent(){
		System.out.println("I am  parent constructor");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Parent p=new Child();

	}

}
class Child extends Parent {
	Child() {
		System.out.println("I am a child constractor");
	}
}

//Constructor can not be overridden//