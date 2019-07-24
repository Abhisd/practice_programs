import java.util.Scanner;
public class Valleys {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of steps");
        int n = sc.nextInt();
        int counter = 0;
        int total = 0;
        String str = null;
        sc.nextLine();
        System.out.println("enter the direction of steps");
        str = sc.nextLine();
        Character c1 = new Character('U');
        Character c2 = new Character('D');
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c1.equals(c)) {
                counter++;
            } else if (c2.equals(c)) {
                counter--;
                if (counter == -1) {
                    total++;
                }
            }
        }
        System.out.print("no of valleys "+total);
    }
 
}
