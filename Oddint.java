/*WAP to calculate total number of odd integers. */
public class Oddint {

    public static void main(String[] args) {
        int ceven=0,codd=0;
//        Scanner scan = new Scanner(System.in);
//        int list= scan.nextInt();
        int[] num ={3,6,9,12,14,16,17,19,21,22,24,25,27,30,35,26,74,56,76,100};

        for(int i=0;i<num.length;i++)
        {
            if (num[i] % 2 == 0)
            {
                ceven++;

    
}
        }
        System.out.println("Total number of even numbers: ");
        System.out.println(ceven);
        System.out.println(codd);
        
    }
}