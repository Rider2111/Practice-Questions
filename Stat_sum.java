/*This program is to create a static function to find the sum of two numbers. */
import java.util.Scanner;

public class Stat_sum {

    static int a,b,sum;
    static Scanner s1 = new Scanner(System.in);
    public static void main(String[] args){
        Input1();
        Input2();
        sum = SumCal(a,b);
        Display(sum);
    }
    public static int Input1(){
      System.out.println("Enter 1st number: ");
      a = s1.nextInt();
      return a;
    }
    public static int Input2(){
      System.out.println("Enter 2nd number: ");
      b = s1.nextInt();
      return b;
    }
    public static int SumCal(int a, int b){
        return(a+b);
    }
    public static int Display(int sum){
       System.out.println("The sum of given numbers is : "+sum);
        return 0;
    }

    
}