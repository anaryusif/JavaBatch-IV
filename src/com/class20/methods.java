package com.class20;

public class methods {
int getGrade(int grade) {
	
	if (grade>90) {
	System.out.println("A");}
	else if (grade>80) {
		System.out.println("b"); }
	else if (grade>70) {
		System.out.println("c"); }
	else if (grade>60 ) {
		System.out.println("d"); }
	return grade;
}
	
	public static void main(String[] args) {
		
		methods input=new methods();
		input.getGrade(95);
	}}