import java.util.Scanner;
import java.io.*;

class Factorial{  
 public static void main(String args[]){  
  int fact=1;
  Scanner sc =new Scanner(System.in);
  System.out.println("enter the number") ; 
  int num=sc.nextInt();  //takes input from user 
  
  for(int i=1;i<=num;i++)
  	{    
      		fact=fact*i;    	//calculates factorial
  	}    
  System.out.println("Factorial of "+num+" is: "+fact);    
 }  
}  
