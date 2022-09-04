/*WAP to divide two numbers and find the quotiont and remainder. */
import java.util.Scanner;

public class Qremainder {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = scan.nextInt();
        System.out.println("Enter second number");
        int num2 = scan.nextInt();
        int q = num1 / num2;
        int r = num1 % num2;
        System.out.println("The quotiont is: " + q + "\n The remainder is: " + r);

        scan.close();
    }

}

    
