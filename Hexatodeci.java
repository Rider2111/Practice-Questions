/*WAP to convert an int value into its hexadecimal and binary equivalent. */
import java.util.Scanner;

public class Hexatodeci {

    public static void main(String[] args){
        int num;
        String i,j;
        Scanner m = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num =m.nextInt();
        
        i = binary_equivalent(num);
        j = hexadecimal_equivalent(num);
         System.out.print("The binary equivalent of "+num+ " is " +i+ "\n");
         System.out.print("The hexadecimal equivalent of "+num+ " is " +j+ "\n");
         m.close();          

        }
     public static String binary_equivalent(int a){
         String c = Integer.toBinaryString(a);
         return c;
    }
     public static String hexadecimal_equivalent(int b){
         String d = Integer.toHexString(b);
         return d;
    }

}