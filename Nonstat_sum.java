import java.util.Scanner;

public class Nonstat_sum {

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int n1 = s.nextInt();
        System.out.print("Enter 2nd number: ");
        int n2 = s.nextInt();
        sum m = new sum(n1,n2);
        m.display();
        s.close();
        }
    
    
}

class sum{
    int a,b,ans;
    sum(int i,int j){
        a=i;
        b=j;
        ans=i+j;
    }
    void display(){
        System.out.print("The sum of the two numbers is "+ans+"\n");
    }
}