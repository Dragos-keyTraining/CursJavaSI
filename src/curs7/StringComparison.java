package curs7;

public class StringComparison {

	public static void main(String[] args) {

		String first = "Java";
		String second = "automation";
		String thrid = "Java";
		String fourth =  new String("Java");
		
		System.out.println(" Case : == ");
		System.out.println(first == second);
		System.out.println("Case : equals ");
		System.out.println(first.equals(second));
		
		System.out.println("----------------------------");
		
		System.out.println("Case : == ");
		System.out.println(first == thrid);
		System.out.println("Case : equals");
		System.out.println(first.equals(thrid));
		
		System.out.println("----------------------------");

		System.out.println("Case :  == ");
		System.out.println(first == fourth);
		System.out.println("Case : equals");
		System.out.println(first.equals(fourth));
		
		
		thrid = "Python";
		System.out.println("----------------------------");
		
		System.out.println("Case schimbat : == ");
		System.out.println(first == thrid);
		System.out.println("Case schimbat : equals");
		System.out.println(first.equals(thrid));
		
	}

}
