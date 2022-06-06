package curs4;

public class BitwiseOperator {
	
	
	public static void main(String[] args) {
		
		/**
		 *  && --> AND --> short circuit 
		 *  (x!=0) && (1/x>5)--> evalueaza (x!=0) si daca asta este true evalueaza conditia (1/x>5)
		 *  & -- > AND 
		 * 	(x!=0) & (1/x>5) --> evalueaza (x!=0) dupa evalueaza (1/x>5) dupa accea aplica conditia &	
		 * 
		 * a || b --> evalueaza A si daca A este false evalueaza B
		 *  
		 *  | --> evalueaza A dupa evalueaza B si dupa aplica | 
		 * 
		 */
		
		
		int x = 0;
		
		if((x!=0) && (1/x>5) ) {
			
			System.out.println("True");
			
		}else {
			
			System.out.println("False");
		}
		
		
		
	}

}
