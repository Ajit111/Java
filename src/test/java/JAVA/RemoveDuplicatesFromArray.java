package JAVA;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray{
	public static void main(String[]args) {
		int Array[]= {1,11,11,11,2,22,22,222,3,3,3,33,33,4,44,44,5};
		Set<Integer> set =new HashSet<>();
		for (int i=0;i<Array.length;i++) {
			set.add(Array[i]);
		}
		System.out.println(set);
	}
}

