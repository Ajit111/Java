package JAVA;



public class ReverseNumber {
    public static void main(String[] args) {
        int num = 12345;
        int reversed = 0;
        int length = String.valueOf(num).length(); // count digits

        for (int i = 0; i < length; i++) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}



