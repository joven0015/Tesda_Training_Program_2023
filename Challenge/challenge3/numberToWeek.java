package Challenge.challenge3;
import java.util.Scanner;

public class numberToWeek {
     public static void changeNumToDay() {
            // int i = numToDay -1 ;//means int i = 0 ;
            Scanner input = new Scanner(System.in);
            String[] Day = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
            int numToDay = input.nextInt();
            System.out.println("1 : "+Day[numToDay]);
            input.close();
           
        }
}
