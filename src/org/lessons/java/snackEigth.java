package org.lessons.java;

import java.util.Arrays;
import java.util.Random;

public class snackEigth {
	public static void main(String[] args) {
		
		int[] rndNumbersArray = new int [10]; 
		
		for (int i = 0; i < rndNumbersArray.length; i++) {
			Random rnd = new Random();
			int rndNumber = rnd.nextInt(150 - 100) + 100; 
			
			rndNumbersArray[i] = rndNumber;
		}
		
		System.out.println(Arrays.toString(rndNumbersArray));
		
	}
}
