package com.class11;

public class practice1 {

	public static void main(String[] args) {

int numbers[]= {3,5,7,8};
int largest=numbers[0];
for (int i=0; i<numbers.length; i++) {
    if (numbers[i]>largest) {
    	largest=numbers[i];
    }}
	System.out.println(largest);	
	}
}
