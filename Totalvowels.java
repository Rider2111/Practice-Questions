//To calculate the total number of vowels in a given string.
import java.util.Scanner;

public class Totalvowels {
    public static void main(String[] args) {
        int count = 0;
        Scanner scan = new Scanner(System.in);
        String value = scan.nextLine();
        String str = value.toLowerCase();
        System.out.println(str);

        for(int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                ++count;
            }
        }

        System.out.println("The total number of vowels in given strings are: ");
        System.out.println(count);

        scan.close();
    }

}