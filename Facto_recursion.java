/*WAP to print factorial of a number using recursion. */
import java.util.Scanner;

public class Facto_recursion{

    public static void main(String args[]){
        System.out.println("\nEnter a number:- ");
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();
        Facto_recursion r = new Facto_recursion();
        int fact = r.factorial(num);
        r.Display(num,fact);

        n.close();
    }
int factorial(int n){
    if (n==0)
        return 1;
    else
        return(n*factorial(n-1));
}
 
 void Display(int n, int fact){
     System.out.println("Factorial of "+n+" is:- "+fact);
 }  


}