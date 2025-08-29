package JAVA;

public class Reverse_String {

	public static void main(String[] args) {
		String originalStr = "Ajit";
		
		// Convert to uppercase
		originalStr = originalStr.toLowerCase();
		
		String ReversedStr = "";
		for (int i = 0; i < originalStr.length(); i++) {
			ReversedStr = originalStr.charAt(i) + ReversedStr;
		}
		System.out.println(ReversedStr);
		
	}
}

