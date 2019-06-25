package com.class26;



public class Students {
String fullName;
int age;
public Students(String fullName, int ageNum) {
	this.fullName=fullName;
	this.age=ageNum;
 
 } 
public void displayDeetails() {
	System.out.println("Student full name is "+fullName+" "+age+ " age");
}
 public static void main(String[] args) {
	Students obj=new Students("John Snow", 30);
    obj.displayDeetails();
 }
}
