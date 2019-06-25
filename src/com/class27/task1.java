package com.class27;

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Userinfo obj=new Userinfo("John", 25);
        obj.userDetails();
	}}

class User {
	String name;
	long mobileNumber;
	User(String name, long mobileNumber){
		this.name=name;
		this.mobileNumber=mobileNumber;
	}
}

class Userinfo extends User  {
 String address;
	Userinfo(String name, long mobileNumber){
	super(name, mobileNumber);
	this.address=address;
}
	public void userDetails() {
System.out.println("User name is "+name+" and phone number is "+ mobileNumber+" and adress "+address);
	
	}}




	