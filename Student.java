import java.util.Scanner;
public class Student {
    int rollno;
    String name;
    void get(){
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter the name:- ");
        name=abc.nextLine();
        System.out.println("Enter the rollno:- ");
        rollno=abc.nextInt();
        abc.close();
    }
    void display(){
        System.out.println("The name is "+ name + " and the rollno is "+ rollno);
    }
    public static void main(String args[]){
        Student s1=new Student();
        s1.get();
        s1.display();
    }
    
}
