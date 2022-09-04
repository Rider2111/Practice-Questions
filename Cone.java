/*WAP to Create an abstract class Shape which has a field PI=3.14 as final and it has an abstract 
method Volume. Make two subclasses Cone and Sphere from this class and they print their volume. 
For further refer to Shape1.java file. */

import java.util.Scanner;
public class Cone extends Shape1{

    void volume(){
        Scanner n=new Scanner(System.in);
        System.out.println("\nEnter radius of cone:- ");
        double radius= n.nextDouble();
        System.out.println("\nEnter height of cone:- ");
        double height=n.nextDouble();
        double v=0.33333*pi*radius*height;
        System.out.println("\nVolume of cone is:-  "+ v);
        n.close();
    }
    
}
