import java.io.*;

import java.util.*;

class Cloud {
    public static void main(String[] args)  {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the no.of clouds");
       int n=sc.nextInt();
       int ar[]=new int[n];
       System.out.println("enter the  cloud value in 0/1");
       for(int i=0;i<n;i++)
       {
           ar[i]=sc.nextInt();
       }
       
      int count = -1;
        for (int i = 0; i < n; i++, count++) {
            if (i<n-2 && ar[i+2]==0) i++;
        }
       System.out.println("no. of jumps "+ count);
       sc.close();
    }
}

