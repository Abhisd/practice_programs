package counter;


import java.lang.reflect.Array;
import java.util.*;

public class Arayop 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int b[]= {1,4,3,2,5};
		int i,j;
		int size=Array.getLength(b);
		//System.out.println(size);
		Arrays.sort(b);
		System.out.println("enter the number to find array elements having sum equal to it  ");
		int k=sc.nextInt();
		i=0;
		j=size-1;
		while(i!=j && i<j)
		{
			
			if(b[i]+b[j]==k)
			{
				System.out.println(b[i]+","+b[j]);
				i++;
				j--;
				
			}
			else if(b[i]+b[j]<k)
				i++;
			else 
				j--;
		}
		
		
		sc.close();
		
	}
}
