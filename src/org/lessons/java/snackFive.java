package org.lessons.java;

import java.util.Scanner;

public class snackFive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert a string to check how many alphabetic characters, how many numbers and how many symbols it contains. Or write 0 to stop the program ");
		String userInput = sc.nextLine();
		
		while (!userInput.equals("0")) {
			System.out.println("Insert a string");
			userInput = sc.nextLine();		
			
		}
		
		System.out.println("Bye");
		
		sc.close();
	}
}
