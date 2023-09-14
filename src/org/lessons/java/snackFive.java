package org.lessons.java;

import java.util.Scanner;

public class snackFive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert a string to check how many alphabetic characters, how many numbers and how many symbols it contains. Or write 0 to stop the program ");
		String userInput = sc.nextLine();
		
		int alphabeticalCharacters = 0;
		int numberCharacters = 0; 
		int symbolCharacters = 0;
		
		while (!userInput.equals("0")) {
			System.out.println("Insert a string");
			userInput = sc.nextLine();	
			
			char[] inputAsArray = userInput.toCharArray();
			System.out.println(inputAsArray);
			
			for (int i = 0; i < inputAsArray.length; i++) {
				if(Character.isLetter(inputAsArray[i])) {
					alphabeticalCharacters ++;
				} else if(Character.isDigit(inputAsArray[i])) {
					numberCharacters ++;
				} else {
					symbolCharacters ++;
				}
			}
			
			System.out.println("You have " + alphabeticalCharacters + " alpabetical characters\n" + numberCharacters + " number characters\n" + symbolCharacters + " symbol characters"  );
			alphabeticalCharacters = 0;
			numberCharacters = 0; 
			symbolCharacters = 0;
		}
		
		System.out.println("Bye");
		
		sc.close();
	}
}
