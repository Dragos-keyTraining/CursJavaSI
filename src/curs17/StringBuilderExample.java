package curs17;

public class StringBuilderExample {

	public static void main(String[] args) {
		reverseSttring("Java");
		deleteFromString("Eu invat java");	
		
	}

	public static void reverseSttring(String text) {
		StringBuilder sb = new StringBuilder(text);
		sb.reverse();
		System.out.println(sb);
	}
	
	public static void deleteFromString(String text) {
		StringBuilder sb = new StringBuilder(text);
		sb.delete(2, 6);
		System.out.println(sb);
	}
	
}
