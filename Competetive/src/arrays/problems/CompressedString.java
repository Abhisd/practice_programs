package arrays.problems;

import java.util.Scanner;

public class CompressedString {

	public String compressString(String str) {
		StringBuilder compressedString = new StringBuilder();
		int consecutiveCount = 0;
		for (int i = 0; i < str.length(); i++) {
			consecutiveCount++;
			if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
				compressedString.append(str.charAt(i));
				compressedString.append(consecutiveCount);
				consecutiveCount = 0;
			}
		}
		return compressedString.length() < str.length() ? compressedString.toString() : str;
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		CompressedString cs=new CompressedString();
		System.out.println(cs.compressString(str));
	}

}
