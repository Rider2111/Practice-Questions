/*To display the results.
For further refer to Shape1.java file. */

import java.util.Scanner;
public class Display {

    public static void main(String args[]){
        Scanner n=new Scanner(System.in);
        System.out.println("\nPlease enter a choice:-\n1. Cone\n2. Sphere");
        int op= n.nextInt();
        switch(op){
            case 1:{
                Cone c = new Cone();
                c.volume();
                break;

            }
            case 2:{
                Sphere s = new Sphere();
                s.volume();
                break;
            }
            default:System.out.println("Invalid choice entered");
        }
        n.close();
        }
    
}
