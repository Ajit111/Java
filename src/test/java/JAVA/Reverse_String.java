package JAVA;

public class Reverse_String{
	public static void main(String[]args) {
		String originalStr="Ajit";
		String revStr="";
		
		for (int i=0;i<originalStr.length();i++) {
            revStr=originalStr.charAt(i)+revStr;  
			
				
		}
		System.out.println(revStr);
//test
	}
}

