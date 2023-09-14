package org.lessons.java;

public class snackThree {
	public static void main(String[] args) {
		int[] numbers = {2, 5, 7, 2, 4, 6, 7, 9};
		
		int sum = 0; 
		
		System.out.println("Sum of the number with an odd index");
		
		for (int i = 0; i < numbers.length; i++) {
			if (i%2 != 0) {
				sum += numbers[i];
			}
		}
		
		System.out.println(sum);
	}
}
