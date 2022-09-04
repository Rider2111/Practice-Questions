import java.util.Scanner;

public class Dob {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str = scan.nextLine();
        String temp=str;
        char arr[]=str.toCharArray();
        arr[0]=temp.charAt(3);
        arr[1]=temp.charAt(4);
        arr[3]=temp.charAt(0);
        arr[4]=temp.charAt(1);
        str=String.valueOf(arr);
        System.out.println(str);

        scan.close();


   }

    
}