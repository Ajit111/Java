package JAVA;

public class For_Loop {
     public static void main(String[]args) {
    	    for (int i = 0; i <= 5; i++) {
                System.out.println(i);
            }

              System.out.println("----");
           
            // Print even numbers from 0 to 10
            for (int j = 0; j <= 10; j += 2) {
                System.out.println(j);
            }
            System.out.println("----");
         // Print sum
            int sum = 0;
            for (int i = 1; i <= 5; i++) {
              sum = sum + i;
            }
            System.out.println("Sum is " + sum);
        
         // Print from 5 to 0
            System.out.println("----");
     for (int i = 5; i > 0; i--) {
    	  System.out.println(i);
    	}
     
     }
   }
    
//public class Main {
//	  public static void main(String[] args) {
//	    for (int i = 0; i < 10; i++) {
//	      if (i == 4) {
//	        break;
//	      }
//	      System.out.println(i);
//	    }  
//	  }
//	}
