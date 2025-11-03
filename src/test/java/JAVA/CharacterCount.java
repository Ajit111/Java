package JAVA;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterCount {
	public static void main(String[] args) {
        String test = "Test";
        test = test.toUpperCase();  // case-insensitive count ke liye

        Map<Character, Integer> map = new LinkedHashMap<>();

        // count each character using normal for loop
        for (int i = 0; i < test.length(); i++) {
            char c = test.charAt(i);
            if (Character.isLetter(c)) {  // sirf letters count karna hai
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }

        // display result using normal for loop
        for (int i = 0; i < map.size(); i++) {
            Character key = (Character) map.keySet().toArray()[i];
            Integer value = map.get(key);
            System.out.print(key + "=" + value + ", ");
        }
    }
}
