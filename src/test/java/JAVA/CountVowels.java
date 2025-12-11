package JAVA;

public class CountVowels {
	 public static void main(String[] args) {
	        String str = "Automaion";
	        int vowels = 0, consonants = 0;
	        
	        str = str.toLowerCase();
	       // for(char c : str.toCharArray()) 
	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);
	        
	        
	            if("aeiou".indexOf(c) != -1) vowels++;
	            else if(c >= 'a' && c <= 'z') consonants++;
	        }
//	        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
	        System.out.println( "vowels" +" "+ vowels);
	        System.out.println( consonants);
	    }
}
       //output=Vowels: 6, Consonants: 3

