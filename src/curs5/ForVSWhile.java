package curs5;

import java.util.Scanner;

public class ForVSWhile {

	/**
	 * Facem un program care ii cere utilizatorului numere pe care le aduna
	 * userul introduce cate numere doreste (fara limita)
	 * cand doreste sa se opreasca va introduce 0
	 * @throws InterruptedException 
	 * 
	 */
	
	public static void main(String[] args) throws InterruptedException {
		ForVSWhile obj  = new ForVSWhile();
		obj.rezovareCuFor();
		obj.rezolvareCuWhile("Text");
		
	}
	
	//dawda
	/*
	 * dawd
	 * dawd
	 * adw
	 * 
	 */
	/**
	 * 
	 */
	public void rezovareCuFor() {
		System.out.println("Please enter a number :");
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		for(int x = scan.nextInt(); x!=0; x = scan.nextInt()) {
			System.out.println(x);
			sum +=x;
			System.out.println("Please enter a number :");
			
		}
		scan.close();
		System.out.println("Suma totala :" + sum);
		
	}
	
	/**
	 * Metoda care foloseste un while pentru a citi de la tastatura
	 * @param ceva -- Parametru pentru metoda
	 * @throws InterruptedException
	 */
	public void rezolvareCuWhile(String ceva) throws InterruptedException  {
		Thread.sleep(4000);
		System.out.println("Please enter a number :");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int sum =0;
		
		while(number !=0) {
			sum +=number;
			System.out.println("Please enter a number :");
			number = scan.nextInt();
		}
		scan.close();

		System.out.println("Suma totala :" + sum);

	}
	
	// try (Scanner scan = new Scanner(System.in)){}
	
	
	

}
