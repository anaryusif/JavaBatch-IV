package com.class4;

public class ifWithinif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double gpa = 3.6;
		double expectedGpa = 3.7;
		boolean hasDiploma = true;
		if (hasDiploma) {
			System.out.println("congrats");
			if (gpa > expectedGpa) {
				System.out.println("you are smart");
			} else {
				System.out.println("you are idot");
			}
		} else {
			System.out.println("get your diploma");

		}
	}
}
