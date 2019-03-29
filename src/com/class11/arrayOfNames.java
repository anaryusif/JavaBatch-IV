package com.class11;

public class arrayOfNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] name=new String [6];
name [0]="Adam";
name[1]="Misha";
name[2]="Bob";
name [3]="John";
name [4]="Rob";
name [5]="Will";
for (int i=0; i<name.length; i++) {
	System.out.println(name[i]);
}
System.out.println();
String[] student= {"lenka", "robert", "nikol"};
for (int i=0; i<=student.length-1; i++) {
	System.out.println(student[i]);
}
System.out.println();
for (String students:student) {
	System.out.println(students);
}
for (int i=0; i<=student.length-1; i++) {
	System.out.println(student[i]);
	}
int [] numbers= {1,2,3,4,5,6};
for (int num:numbers) {
	System.out.print(num+"  ");
}
}}
