import java.util.Scanner;

public class Numcheck {

    public static void main(String args[]){
        Scanner abc = new Scanner (System.in);
        System.out.println("Enter a number:- ");
        int num = abc.nextInt();
        if(num%2==0){
            System.out.println("The output is 1");
        }
        else{
            System.out.println("The output is 0");
        }
        abc.close();
    } 

    
}