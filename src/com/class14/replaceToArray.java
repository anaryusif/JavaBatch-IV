package com.class14;

public class replaceToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="Sunday";

char[] array=name.toCharArray();
for (char array1:array) {
	 
		System.out.println(array1);
		String str = "Today is Java Class";
        String revers = "";
        for(int i = str.length()-1; i >= 0; i--) {
            
            revers += str.charAt(i);
            
        }
        System.out.print(revers+" ");
	}
}

}
