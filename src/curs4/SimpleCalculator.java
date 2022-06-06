package curs4;

import java.util.Scanner;

public class SimpleCalculator {
	
	/**
	 * Facem un calcultor simplu pentru operatiile de baza :  + (adunare) *(inmultire) -(scadere) /(impartire)
	 * Intrebam userul care este primul numar
	 * Intrebam userul care este operatia matematica
	 * Intrebam userul care este numarul 2
	 * Printam rezultatul sub forma Ex: 2 + 2 = 4
	 *  
	 */
	
	
	int num1;
	int num2;
	char operation;
	int result;
	
	//masina
	//012345
	
	//1 metoda pt a citi de la tastatura
	public void askTheUser() {
		Scanner scan  =  new Scanner(System.in);
		System.out.println("Please enter the first number :");
		num1 = scan.nextInt();
		System.out.println("Please enter the operation :");
		operation = scan.next().charAt(0);
		System.out.println("Please enter the second number :");
		num2 = scan.nextInt();
		scan.close();
	}
	
	
	//2 metoda pentru calcul
	public void calculateValues() {
		
		if(operation == '+') { // pentru String nu folosim == . Pentru String folosim equals (ex. Text.equals(altText))
		
			result = num1 + num2;
			printResults();
			
		}else if(operation == '-') {
			result = num1 - num2;
			printResults();
			
		}else if(operation == '*' || operation == 'x' ) {
			
			result = num1 * num2;
			printResults();
			
		}else if(operation == '/' || operation == ':') {
			
			result = num1 / num2;
			printResults();
			
		}else {
			System.out.println("Wrong operation! Please insert only : '+'; '-'; '/'; '*'; ':'; 'x'");
		}
			
	}
	
	
	public void printResults() {
		
		System.out.println(num1 + " "+ operation +" " + num2 + " = "+ result);

	}
	
	
	
	
	

}
