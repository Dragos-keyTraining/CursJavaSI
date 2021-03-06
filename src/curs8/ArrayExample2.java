package curs8;

import java.util.Random;

public class ArrayExample2 {

	/*
	 * Facem un program care genereaza 6 numere intre 0-9
	 * le pune int-un array
	 * nu pune numere duplicate
	 * si printeaza array-ul
	 * 
	 */
	//int[] numbers =  new int[6]

	//constanta
	public final int LENGHT = 6;
	//int[] numbers =  new int[LENGHT];
	public final int MAX_NUMBERS = 9;
	
	
	public static void main(String[] args) {

		ArrayExample2 obj =  new ArrayExample2();
		obj.printArray(obj.generateNumbers());
		
		
		
	}
	
	public int[] generateNumbers() {
		int[] numbers =  new int[LENGHT];
		
		Random random =  new Random();
		
		for(int i = 0; i< LENGHT;i++) {
			
			int randomNr = 0;
			
			do {
				randomNr = random.nextInt(MAX_NUMBERS);

			}while(checkForUnicity(numbers, randomNr));
			
			numbers[i] = randomNr;
		}
		
		return numbers;
	}
	
	public void printArray(int[] array) {
	
		for(int nr : array) {
			System.out.print( nr + " | ");
		}	
	}
	
	public boolean checkForUnicity(int[] array, int element) {
		
		for(int nr : array) {
			
			if(nr == element ) {
				return true;
			}
		}return false;
		
	}

}
