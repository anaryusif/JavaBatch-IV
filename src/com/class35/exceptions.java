package com.class35;

public class exceptions {
public static void main(String[] args) {
	System.out.println("Begining of the code");
	try {
		Thread.sleep(2000);
	}catch (InterruptedException e) {
		e.getMessage();
	}
}
}
