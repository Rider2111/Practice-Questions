/*WAP to find the sum of the digits of a number. */
import java.util.Scanner;

public class Sumofdigit {

    public static void main(final String[] args) {
        int num, sum;
        final Scanner m = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = m.nextInt();

        sum = sum_of_digits(num);

        System.out.print("The sum is: " + sum + "\n");
        m.close();
    }

    public static int sum_of_digits(int a) {
        int s = 0;
        while (a > 0) {
            final int m = a % 10;
             s= s + m;
             a = a/10;
         }
         return s; }
         

    
}