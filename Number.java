// code to extract integers from string


import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
class Number {
	public static void  main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String n;
		System.out.println("enter the string");
		n=sc.next();
		Pattern p=Pattern.compile("[^\\d]*[\\d]+[^\\d]+([\\d]+)");
		Matcher m=p.matcher(n);
		while(m.find()) {
			System.out.print(m.group());
		}	
	
	}


}
