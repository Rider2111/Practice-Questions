/*WAP to print given characters as a pyramid. */
public class Pyramid 
{
    public static void main(String[] args) {


        int n = 5;
        char arr[] = new char[]{'a','e','i','o','u'};

        for(int i=0;i< arr.length;i++)
        {
            for(int j=0;j<n;j++)
                System.out.print(" ");
            n--;

            for(int j=0;j<=i;j++)
                System.out.print(arr[j]+" ");

            System.out.println();

        }
    }

        


}