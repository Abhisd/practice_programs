import java.util.*;
class Line_reverse{
    public static void main(String args[]){
    
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the sentence");
    String s=sc.nextLine();
    String str[] = s.split(" ");
    String finalStr="";
        for(int i = str.length-1; i>= 0 ;i--){
            finalStr += str[i]+" ";
        }
        System.out.println(finalStr);
    }
}
