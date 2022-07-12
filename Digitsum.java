import java.util.Scanner;
public class Digitsum {
    public static void main(String args[]){
        Scanner abc= new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int num=abc.nextInt();
        int sum=0;
        while(num>0){
            int a=num%10;
            sum=sum+a;
            num=num/10;
        }
        System.out.println("The sum of digits is:- " + sum);
        abc.close();
    }   
}
