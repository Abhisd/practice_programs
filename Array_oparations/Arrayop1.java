package counter;

import java.util.Scanner;

public class Arrayop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[50];
		int flag=0;
		System.out.println("ENTER THE SIZE OF AN ARRAY");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		
		System.out.println("enter the elements of an array in sorted manner");
		for(int i=1;i<=n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(" elements of an array");
		for(int i=1;i<=n;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("enter the number to find array elements having sum equal to it  ");
		int k=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(a[i]+a[j]==k)
				{
					 flag=1;
					System.out.println(a[i]+","+a[j]);
				}
					
			}
		}
		if(flag==0)
		{
			System.out.println("numbers not found");
		}
		
		
		sc.close();
	}

}
