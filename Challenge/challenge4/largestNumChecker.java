package Challenge.challenge4;

import java.util.Scanner;

public class largestNumChecker {
    public static void highestChecker() {
        int [] num = new int [3] ;
        Scanner input =new Scanner(System.in);
        int a = (num[0]= input.nextInt());
        int b = (num[1]= input.nextInt());
        int c = (num[2]= input.nextInt());
        input.close();
        int largest = (a >= b) ? ((a >= c) ? a : c) : ((b >= c) ? b : c);
        if (a == (b = c))System.out.println("All numbers that you entered are equals");
        else System.out.println("The highest number is : "+largest); 
    }
}
