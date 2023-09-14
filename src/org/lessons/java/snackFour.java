package org.lessons.java;

import java.util.Arrays;
import java.util.Scanner;

public class snackFour {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert a word and check if is palindrome");
		String userWord = sc.nextLine();
		
		//convert the word into an array
		char[] stringAsArray = new char[userWord.length()];
		for (int i = 0; i < userWord.length(); i++) {
			stringAsArray[i] = userWord.charAt(i);
		}
		
		//reverse the array
		String stringReverse = "";
		
		for (int i = stringAsArray.length -1; i > -1; i--) {
			stringReverse = stringReverse + stringAsArray[i];	
		}
		
		if(userWord.equals(stringReverse)) {
			System.out.println("It's palindrome");
		} else {
			System.out.println("It's not palidrome");
		}
		
		
	}
}
