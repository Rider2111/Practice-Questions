import java.util.Scanner;

public class Table {

    public static void main(String args[]){
        Scanner multi = new Scanner(System.in);
        System.out.println("Enter the number for table:");
        int num = multi.nextInt();
        System.out.println("the multiplication table upto 10 is:");
        for(int i=1;i<=10;i++){
            System.out.println(num + " X " + i + " = " + (num*i) ) ;
        }
        multi.close();
    }
    
}