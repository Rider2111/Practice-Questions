//Swap two number without using third variable.
import java.util.Scanner;

public class Swapnum {
    public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter two numbers: ");
    int a = scan.nextInt();
    int b = scan.nextInt();

    System.out.print(a+" ");
    System.out.println(b);
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.print(a+" ");
    System.out.print(b);

    scan.close();

}

}