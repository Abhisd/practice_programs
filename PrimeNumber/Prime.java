package counter;
import java.util.Scanner;
public class prime {

	public static void main(String[] args)
	{
		int i=0;
		int num  =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter thre number upto which prime number to be displayed");
		int n=sc.nextInt();
		String primenumbers=" ";
		for(i=1;i<=n;i++)
		{
			int counter=0;
			for(num=i;num>=1;num--)
			{
				if(i%num==0)
				{
					counter=counter+1;
					
				}
				
			}
			if(counter==2)
			{
				primenumbers=primenumbers+i+" ";
				
			}
			
		}
		System.out.print("prime numbers from 1 to "+n+ " are");
		System.out.println(primenumbers);
	}
	

}
