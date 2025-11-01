package JAVA;

public class Reverse_String {

	public static void main(String[] args) {
	String originalStr="Ajit";
	String reversedStr="";
	for (int i=0;i<originalStr.length();i++) {
		reversedStr=originalStr.charAt(i)+reversedStr;
		
	}
		
	System.out.println(reversedStr);
		

	}

}
