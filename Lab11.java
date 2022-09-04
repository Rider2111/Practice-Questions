/*WAP in which a class inherits two interfaces. */
import java.util.Scanner;

interface area{
    public void ar(int s);
}
interface volume{
    public void vol(int s);
}


 class Shape implements area, volume {
    Scanner sc = new Scanner(System.in);
        public void ar(int s){
            
            System.out.println("\nArea of cube is: "+ 6*s*s);

        }
        public void vol(int s){
            System.out.println("\nVolume of cube is: "+ s*s*s);
        }
    }

    
public class Lab11 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the side of the cube");
        int side= sc.nextInt();
        Shape sp = new Shape();
        sp.ar(side);
        sp.vol(side);
        sc.close();
    }
    
}