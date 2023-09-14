package org.lessons.java;

import java.util.Scanner;

public class snackFive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert a string to check how many alphabetic characters, how many numbers and how many symbols it contains. Or write 0 to stop the program ");
		boolean blockProgram = false;
		
		int alphabeticalCharacters = 0;
		int numberCharacters = 0; 
		int symbolCharacters = 0;
		
		while (!blockProgram) {
			System.out.println("Insert a string");
			String userInput = sc.nextLine();
			
			if( userInput.equals("0")) { 
				blockProgram = true;
			} else {
			
			char[] inputAsArray = userInput.toCharArray();
			
			for (int i = 0; i < inputAsArray.length; i++) {
				if(Character.isLetter(inputAsArray[i])) {
					alphabeticalCharacters ++;
				} else if(Character.isDigit(inputAsArray[i])) {
					numberCharacters ++;
				} else {
					symbolCharacters ++;
				}
			}
			
			System.out.println("You have\n" + alphabeticalCharacters + " alpabetical characters\n" + numberCharacters + " number characters\n" + symbolCharacters + " symbol characters"  );
			alphabeticalCharacters = 0;
			numberCharacters = 0; 
			symbolCharacters = 0;
			}
		}
		
		System.out.println("Bye");
		
		sc.close();
	}
}
