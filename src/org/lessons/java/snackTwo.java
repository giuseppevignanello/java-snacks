package org.lessons.java;

import java.util.Iterator;
import java.util.Random;

public class snackTwo {
	public static void main(String[] args) {
		String[] names = {"Giuseppe", "Lorenzo", "Mattia", "Michele", "Alessia", "Giovanni"}; 
		String[] surnames = {"Rossi", "Bianchi", "Verdi", "Esposito", "Neri", "Prova"};
		
		for (int i = 0; i < 10; i++) {
			Random rnd = new Random();
			int rndNameIndex = rnd.nextInt(names.length -1);
			int rndSurnameIndex = rnd.nextInt(surnames.length -1);
			
			String rndName = names[rndNameIndex];
			String rndSurname = surnames[rndSurnameIndex];
			
			String nameSurname = rndName + ' ' + rndSurname;
			
			System.out.println(nameSurname);
			
		}
	}
}
