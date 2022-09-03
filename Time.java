/*This program is to convert seconds to hour, minute and seconds. */
import java.util.Scanner;
public class Time {
    
    public static void main(String args[]){
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter the time in seconds:- ");
        int sec= abc.nextInt();
        int hr= sec/3600;
        sec= sec%3600;
        int min=sec/60;
        sec=sec%60;
        System.out.println("the time is " + hr + " hr " + min + " min "+ sec+ " s");
        abc.close();

    }  

}