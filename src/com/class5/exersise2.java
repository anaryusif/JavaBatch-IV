package com.class5;

import java.util.Scanner;

public class exersise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner grades = new Scanner(System.in);
		System.out.println("imput quiz");
		int quiz = grades.nextInt();
		System.out.println("imput midterm");
		int mid = grades.nextInt();
		System.out.println("imput final");
		int finall = grades.nextInt();
		int average = (quiz + mid + finall) / 3;
		if (average >= 90) {
			System.out.println("greate is a");
		} else if (average >= 70 && average <= 90) {
			System.out.println("grade is b");
		} else if (average >= 50 && average <= 70) {
			System.out.println("grade is c");
		} else if (average < 50)
			System.out.println("grade is f");
		else
			System.out.println("fail");

		{
		}
	}
}
