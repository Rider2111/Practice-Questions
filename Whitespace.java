//To remove the whitespace in a string.
import java.util.Scanner;

public class Whitespace {
    
    public static void main(String[] args) {
        System.out.println("Enter the string to trim: ");
        Scanner scan= new Scanner(System.in);
        String value = scan.nextLine();

        String nospace= value.replace(" ","");
        System.out.println(nospace);
        scan.close();
    }
    
}