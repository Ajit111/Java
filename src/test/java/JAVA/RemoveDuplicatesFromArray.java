package JAVA;

import java.util.HashSet;
public class RemoveDuplicatesFromArray{
	public static void main(String[]args) {
		int Array[]= {1,11,1,1,2,2,2,3,33,4,44,4};
		HashSet<Integer>set =new HashSet<>();
		for (int i:Array) {
           set.add(i);			
		}
		System.out.println(set);
	}
}
