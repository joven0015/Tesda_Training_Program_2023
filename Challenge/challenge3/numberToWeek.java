package Challenge.challenge3;
import java.util.Scanner;

public class numberToWeek {
     public static void changeNumToDay() {
            // int i = numToDay -1 ;//means int i = 0 ;
            Scanner input = new Scanner(System.in);
            String[] Day = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
            System.out.print("Input Number : ");
            int numToDay = input.nextInt();
            int day = numToDay-1;
            System.out.println(numToDay+" : "+Day[day]);
            input.close();
           
        }
}
