import java.util.Scanner;

public class GradingAssignment {
    public static void main(String[] args) {

        Scanner scannerGrade = new Scanner(System.in);

        System.out.print("Enter your grade: ");
        double grade = scannerGrade.nextDouble();

        if(grade >= 90) {
            System.out.println("You got an A!");
        } else if(grade < 65) {
            System.out.println("You got an F. Try again.");
        } else {
            System.out.println("No idea what your grade is!?!");
        }
    }
}
