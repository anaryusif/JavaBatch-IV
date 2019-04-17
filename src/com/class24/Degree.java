package com.class24;



public class Degree {

public void getDegree() {
	System.out.println("I got degree");
}	
}
class Undergraduate extends Degree{	
	public void undergraduate() {
		System.out.println("I am a undergradute");
	}
}
class Postgradute extends Degree{
public void postgradute() {
		System.out.println("I am postgradute");
	}

}

