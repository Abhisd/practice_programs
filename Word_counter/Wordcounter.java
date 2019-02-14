package counter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.stream.FileCacheImageInputStream;
public class Wordcounter {

	private static Scanner sc,sd;

	public static void main(String[] args) throws IOException {
		int count=0;
		int flag=1;
		File file=new File("C:/git/Abhishek/read.txt"); //file name
		FileInputStream fin = new FileInputStream(file);
		sc = new Scanner(fin);								//takes file as input & object for file
		byte [] bytesArray = new byte[(int)file.length()];  //length of the file
		fin.read(bytesArray);								//reading the file
		String s=new String(bytesArray);
		sd = new Scanner(System.in); 						 //taking any word from the file to search & object for word to be searched
		System.out.println("enter the word you want to search from the file  ");
		String d=sd.next();
		String [] data =s.split(d);							//searching the word
		for(int i=0;i<data.length;i++)
		{
			count++;						// count of the word
		}
		 System.out.println("number of charactres in the givenn file are "+count);
	   if(count==0)							//if word not found
	   {
		   System.out.println("word not found!!!");
	   }
		

}
}