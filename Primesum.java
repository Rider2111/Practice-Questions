public class Primesum {

    public static void main(String args[]){
        int sum=0;
        int pr=1;
        int count=0;
        int i;
        for( i=2;count<=100;i++){
             pr=1;
            for(int j=2;j<i/2;j++){
                if(i%j==0){
                    pr=0;
                    break;
                }
            }
            if(pr==1){
                count++;
                sum=sum+i;
        }
        }
        System.out.println("The sum is " + sum);
    }   
    
}