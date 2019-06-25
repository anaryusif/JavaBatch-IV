package com.class29;

class Encapsulation {
	public static void main(String[] args) {
		Student obj = new Student();
		obj.setName("John");
		obj.setAge(17);
		
		
		

	}
}

class Student {
	private int age = 10;
	private String name= "";

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}