package curs1;

public class FirstJavaClass {

	//--> one line comment
	
	/*
	 * --> multiple line comment
	 */
	
	int age = 23;

	//variabila
	String nume = "Jhonny";
	//String --> reprezinta data typul variabilei
	// nume --> numele ales de user petnru variabila
	// = --> reprezinta un opertaor de atribure 
	// "Jhonny" --> reprezinta valoarea care este tinuta in variabila nume
	
	
	public static void main(String[] args) {
		
		FirstJavaClass obiect = new FirstJavaClass();
		obiect.grettings();
		
	}

	
	//metoda
	public void grettings() {
		
		System.out.println("Hello " + nume);
	}
	// public --> acces modifier
	//void --> return type
	//grettins --> reprezinta numele metodei




}
