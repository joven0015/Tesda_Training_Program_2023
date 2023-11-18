package Challenge;

public class gradingSystem {
    public static void main(String[] args) {
        int grade = 90;
        if (grade > 89 && grade < 101) System.out.println("Your grade is A");
        else if (grade > 79 && grade < 90) System.out.println("Your grade is B");
        else if (grade >69 && grade <80) System.out.println("Your Grade is C");
        else if (grade > 59 && grade < 70) System.out.println("Your Grade is D");
        else if (grade<60) System.out.println("Your Grade is F");
        else System.out.println("error");
    }
     
}