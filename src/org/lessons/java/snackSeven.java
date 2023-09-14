package org.lessons.java;

import java.util.Scanner;

public class snackSeven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Insert the number of seconds: ");
		int seconds = sc.nextInt();
		
		//there are 3600 seconds into an hours 
				int hours = seconds / 3600;
		//the seconds the are not counted into hours / 60
		int minutes = (seconds % 3600) / 60; 
		
		//the remaining seconds 
		int secondsToDisplay = seconds % 60; 
		
		System.out.println(seconds + "->" + String.format("%02d", hours) + ":" + String.format("%02d", minutes) + ":" + String.format("%02d", secondsToDisplay));
		
	}
}
