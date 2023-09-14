package org.lessons.java;

import java.util.Arrays;
import java.util.Random;

public class snackEigth {
	public static void main(String[] args) {
		
		int[] rndNumbersArray = new int [10]; 
		int minValue = 150;
		int maxValue = 0; 
		int sum = 0; 
		
		for (int i = 0; i < rndNumbersArray.length; i++) {
			Random rnd = new Random();
			int rndNumber = rnd.nextInt(150 - 100) + 100; 
			
			rndNumbersArray[i] = rndNumber;
			
			sum += rndNumbersArray[i];
			
			if (rndNumbersArray[i] < minValue) {
				minValue = rndNumbersArray[i];
			}
			if (rndNumbersArray[i] > maxValue) {
				maxValue = rndNumbersArray[i];
			}
		};
		
		double averageValue = (double) sum / 10; 
		
		System.out.println("Random numbers: " + Arrays.toString(rndNumbersArray) + "\n" 
							+ "Min value: " + minValue + "\n" 
							+ "Max value: " + maxValue 
							+ "\n" + "Average value: " + String.format("%.02f", averageValue));
		
	}
}
