import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

    public static void main(String[] args)throws Exception {
    	System.out.println("enter no. of socks");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        System.out.println("enter the socks code");
        for(int i=0; i < n; i++)
        {
            c[i] = in.nextInt();
        }
        
        Arrays.sort(c);
       
        int count=0;
        for(int i=0;i<n-1;i++)
            {
             
            if(c[i]==c[i+1])
                 {
                  count++;
                  i+=1;     
                  }
            }
        System.out.println("pairs of socks "+count);
        }
    }
