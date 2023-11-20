package Challenge.challenge2;


import java.util.Scanner;
class Days{
    public static void day28(){
        for (int i= 1;i<29;i++){
            if (i % 7== 1) System.out.println();
            System.out.print(i + "\t");
        }
        System.out.println();
    } 
    public static void day31(){
        for (int i= 1;i<32;i++){
            if (i % 7== 1) System.out.println();
            System.out.print(i + "\t");
        }
        System.out.println();
    } 
    public static void day30(){
        for (int i= 1;i<31;i++){
            if (i % 7== 1) System.out.println();
            System.out.print(i + "\t");
        }
        System.out.println();
    } 
    
}
public class Year {
    public static void monthCount() {
        Scanner input = new Scanner(System.in);
        int months = input.nextInt();
        input.close();
        
        switch (months) {
            case 1:
                System.out.print("january");
                Days.day31();
                break;
            case 2:
                System.out.print("February");
                Days.day28();
                break;
            case 3:
                System.out.println("March");
                Days.day30();
                break;
            case 4:
                System.out.print("April");
                Days.day31();
                break;
            case 5:
                System.out.print("May");
                Days.day30();
                break;
            case 6:
                System.out.print("June");
            
                Days.day31();
                break;
            case 7:
                System.out.print("July");
                Days.day30();
                break;
            case 8:
                System.out.print("August");
                Days.day31();
                break;
            case 9:
                System.out.print("September");
                Days.day30();
                break;
            case 10:
                System.out.print("October");
                Days.day31();
                break;
            case 11:
                System.out.print("November");
                Days.day30();
                break;
            case 12:
                System.out.print("December");
                Days.day31();
                break;
        
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
