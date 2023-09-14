package org.lessons.java;

import java.util.Random;

public class snackTen {
	public static void main(String[] args) {
		int[] rndNumbersArray = new int [10];
		
		Random rnd = new Random();
		int rndNumber = rnd.nextInt(1000 - 100) + 100;
		
		for (int i = 0; i < rndNumbersArray.length; i++) {
			rndNumbersArray[i] = rndNumber;
		}
		
		
	}
}
