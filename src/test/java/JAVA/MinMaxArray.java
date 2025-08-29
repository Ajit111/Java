package JAVA;

public class MinMaxArray {
	  public static void main(String[] args) {
	        int arr[] = {12, 5, 45, 3, 19};
	        int min = arr[0], max = arr[0];
	        
	        for(int n : arr) {
	            if(n > max) max = n;
	            if(n < min) min = n;
	        }
	        System.out.println("Min: " + min + ", Max: " + max);
	    }
}
