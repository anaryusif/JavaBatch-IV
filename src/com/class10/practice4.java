package com.class10;

public class practice4 {

	public static void main(String[] args) {
		String cars[][]= {
				{"American", "German", "Korean", "Italian"},
				{"ford", "Mercedes", "Kia", "Fiat"},
				{"Chevy", "BMW", "Huindayi", "Alfromeo"}};
		
		for (int a=0; a<cars.length; a++)
		 {
	   for (int j=0; j<cars[a].length; j++) {
				System.out.print(cars[a][j]+"   ");
			}
		System.out.println();
		}
		}
	}


