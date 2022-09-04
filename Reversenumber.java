//Reverse a number
import java.util.Scanner;

public class Reversenumber {
    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number to reverse");
        int num=scan.nextInt();
        int rev=0;
        while (num!=0)
        {
            rev= rev*10+num%10;
            num=num/10;
        }
        System.out.println(rev);
        scan.close();
    }

}