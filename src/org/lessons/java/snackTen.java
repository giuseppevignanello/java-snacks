package org.lessons.java;

import java.util.Arrays;
import java.util.Random;

public class snackTen {
	public static void main(String[] args) {
		int[] rndNumbersArray = new int [10];
		int evenNumbers = 0; 
		int oddNumbers = 0; 
		int[] numbersIndexEven = new int [5];
		int[] numbersIndexOdd = new int [5];
		
		
		
		for (int i = 0; i < rndNumbersArray.length; i++) {
			Random rnd = new Random();
			int rndNumber = rnd.nextInt(1000 - 100) + 100;
			rndNumbersArray[i] = rndNumber;
			if (rndNumber % 2 == 0) {
				evenNumbers ++;
			} else {
				oddNumbers ++;
			}
			
		}
		
		int[] evenNumbersArray = new int [evenNumbers]; 
		int[] oddNumbersArray = new int [oddNumbers];
		
		evenNumbers = 0;
		for (int i = 0; i < rndNumbersArray.length; i++) {
			if(rndNumbersArray[i] % 2 == 0) {
				evenNumbersArray[evenNumbers] = rndNumbersArray[i];
				evenNumbers ++;
			} 
		}
		
		oddNumbers = 0;
		for (int i = 0; i < rndNumbersArray.length; i++) {
			if(!(rndNumbersArray[i] % 2 == 0)) {
				oddNumbersArray[oddNumbers] = rndNumbersArray[i];
				oddNumbers++;
			}
		}
		
		int indexCounter = 0;
		for (int i = 0; i < rndNumbersArray.length; i+=2) {
			numbersIndexEven[indexCounter] = rndNumbersArray[i];
			indexCounter ++;
		}
		
		indexCounter = 0; 
		for (int i = 1; i < rndNumbersArray.length; i+=2) {
			numbersIndexOdd[indexCounter] = rndNumbersArray[i];
			indexCounter ++;
		}
		
		System.out.println(Arrays.toString(rndNumbersArray));
		System.out.println("Even numbers: " + Arrays.toString(evenNumbersArray) + "\n"
							+ "Odd numbers: " + Arrays.toString(oddNumbersArray) + "\n"
							+ "Even Index number" + Arrays.toString(numbersIndexEven) + "\n"
							+ "Odd Index number" + Arrays.toString(numbersIndexOdd));	
					
	}
}
