/*WAP to Create an abstract class Shape which has a field PI=3.14 as final and it has an abstract 
method Volume. Make two subclasses Cone and Sphere from this class and they print their volume. 
For further refer to Shape1.java file. */

import java.util.Scanner;

public class Sphere extends Shape1{

    void volume(){
        Scanner n=new Scanner(System.in);
        System.out.println("\nEnter radius of Sphere:- ");
        double radius=n.nextDouble();
        double v= 1.3333333*pi*radius*radius*radius;
        System.out.println("\nThe volume of sphere is :- "+ v); 
        n.close();
    
}
}
