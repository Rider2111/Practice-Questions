/*This program accepts an integer (n) and computes the value of n+nn+nnn. */
import java.util.Scanner;

public class Sum {
    public static void main(String args[]){
        System.out.println("Enter the number:- ");
        Scanner abc = new Scanner(System.in);
        int n=abc.nextInt();
        int nn= (n*n);
        int nnn= (n*n*n);
        int sum = n + nn + nnn;
        System.out.println("The sum of n + nn + nnn is:- "+sum);
        abc.close();
    }
    
}
