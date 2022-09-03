/*This program is about to Create a student class with main() inside the class. 
Create an object of the class to access the members 
through reference variable. */


import java.util.Scanner;
public class Student {
    int rollno;
    String name;
    void get(){
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter the name:- ");
        name=abc.nextLine();
        System.out.println("Enter the roll no:- ");
        rollno=abc.nextInt();
        abc.close();
    }
    void display(){
        System.out.println("The name is "+ name + " and the roll no is "+ rollno);
    }
    public static void main(String args[]){
        Student s1=new Student();
        s1.get();
        s1.display();
    }
    
}
