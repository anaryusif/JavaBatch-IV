package com.class25;

public class Student {
public void study() {
	System.out.println("Students must study");
}
protected void doHomeWork() {
	System.out.println("Students must do homework");
	
}
void attendClasses() {
	System.out.println("Students must attend classes");
}
private void doResearch() {
	System.out.println("Student must do search");
}
}
class SytaxStudent extends Student {
	public void study() {
		System.out.println("Sytax Students must study");
	}
	protected void doHomeWork() {
		System.out.println("Sytax Students must do homework");
		
	}
	void attendClasses() {
		System.out.println("Sytax Students must attend classes");
	}
	private void doResearch() {
		System.out.println("Sytax Student must do search");
	}
	}

