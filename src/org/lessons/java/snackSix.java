package org.lessons.java;

import java.util.Arrays;

public class snackSix {
	public static void main(String[] args) {

		String numberAsString = "12345678";
		
		//initialize the number as integer
		int numberAsInt = 0;
		//convert the string into an array
		char[] numberAsArray = new char[numberAsString.length()];

		for (int i = 0; i < numberAsString.length(); i++) {
			numberAsArray[i] = numberAsString.charAt(i);
		}
		
		
		for (int i = 0; i < numberAsArray.length; i++) {
			char digit = numberAsArray[i];
			//convert digit into a integer
	        int intValue = digit - 48; 
	        numberAsInt = numberAsInt * 10 + intValue; 
	        

		}
		System.out.println("This is the number as string: " + numberAsString);
		System.out.println("This is the number as int: " + numberAsInt);
	}
}
