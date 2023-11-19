package Challenge;
import java.util.Scanner;
public class numberToWeek {
        public static void main(String[] args) {
            String[] Days = {"Monday","Teusday","wednesday","Thursday","Friday","Saturday","Sunday"};
            Scanner input = new Scanner(System.in);
            int numToDay = input.nextInt();
            int i = numToDay -1 ;
            System.out.println( numToDay+" : "+ Days[i]);
            input.close();
        }
}