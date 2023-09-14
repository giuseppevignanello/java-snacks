package org.lessons.java;

import java.util.Scanner;

public class snackNine {
	public static void main(String[] args) {
		
		int sum = 0; 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers until the sum does not exceed one thousand");
		
		while ( sum < 1000) {
			int userNumber = sc.nextInt();
			sum += userNumber;
			System.out.println(sum);
		}
		
		System.out.println("Finished!");
	}
}
