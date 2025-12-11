package JAVA;

import java.util.HashMap;

public class Duplicate_Characters_In_String {
	  public static void main(String[] args) {
	        String str = "automation";
	        HashMap<Character, Integer> map = new HashMap<>();
	        
	        for(char c : str.toCharArray()) {
	            map.put(c, map.getOrDefault(c, 0) + 1);
	        }
	        
	        for(char c : map.keySet()) {
	            if(map.get(c) > 1)
	                System.out.println(c + " : " + map.get(c));
	        }
	    }
}
     //output=a : 2,t : 2, o : 2


 
