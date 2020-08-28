package arrays.problems;

import java.util.Arrays;
import java.util.Scanner;

//method to decide if one string is permutation of the other or not.
//if two strings are permutation for each other then both the strings contains 
//same characters in different order,by sorting their characters and comparing will check 
//whether one string is permutation of other or not.


public class CheckPermutation {
	
	public String sort(String s) {
		
		char[] content=s.toCharArray();
		Arrays.sort(content);
		System.out.println(content);
		return new String(content);
		
	}
	public boolean permutation(String s,String t) {
		if(s.length()!=t.length()) {
			return false;
		}
		return sort(s).equals(sort(t));
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Strings to check their permutation");
		String s=sc.nextLine();
		String t=sc.nextLine();
		CheckPermutation cp=new CheckPermutation();
		System.out.println(cp.permutation(s, t));
	}

}
