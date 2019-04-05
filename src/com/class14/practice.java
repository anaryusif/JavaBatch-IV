package com.class14;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="13231Hello World234234 434*&^(*^(*";
System.out.println(name.replaceAll("[0-9]", ""));
String name1=name.replaceAll("[^A-Za-z]", " ");
String name2=name.replaceAll("[A-Za-z]", " ");
System.out.println(name1);
System.out.println(name2);

	}

}
