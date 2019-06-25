package com.class26;

public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("phone");
		Phone phone=new Phone();
phone.hasCamera();
phone.makeCall();

System.out.println("Iphone");

iPhone iphone=new iPhone();
iphone.hasCamera();
iphone.makeCall();
System.out.println("Samsung");

Samsung samsung=new Samsung();
samsung.makeCall();
samsung.hasCamera();
	
Phone p=new iPhone();
p.hasCamera();
p.makeCall();
Phone p1=new Nokia();
p1.makeCall();
p1.hasCamera();


	}

}
