/*WAP to to implement constructor overloading by passing different number of parameters of different types. */
import java.util.Scanner;

public class Pass_parameter {
    public static void main(String args[]){
        System.out.println("\nEnter the dimensions of cuboid:");
        Scanner n = new Scanner(System.in);
        int c1 = n.nextInt();
        int c2 = n.nextInt();
        int c3 = n.nextInt();
        Volume v1 = new Volume (c1,c2,c3);
        v1.displayvolofcuboid();
        
        System.out.println("\nEnter the dimensions of cube:");
        int p1 = n.nextInt();
        Volume v2 = new Volume (p1);
        v2.displayvolofcube();
        
        System.out.println("\nEnter the dimensions of cylinder:");
        int y1 = n.nextInt();
        int y2 = n.nextInt();
        Volume v3 = new Volume (y1,y2);
        v3.displayvolofcylinder(); 

        n.close();
    }
}
