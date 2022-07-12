import java.util.Scanner;

public class Numswap {

    public static void main(String args[]){
        Scanner abc=new Scanner(System.in);
        System.out.println("Enter number 1:- ");
        int num1= abc.nextInt();
        System.out.println("Enter number 2");
        int num2=abc.nextInt();
        System.out.println("The value of number 1 is " + num1 + " and number 2 is " + num2 + " before swapping");
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("The value of number 1 is " + num1 + " and number 2 is " + num2 + " after swapping");
        abc.close();
    } 

    
}