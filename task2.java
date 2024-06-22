package codsoft_task;
import java.util.*;

public class task2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String Grade = ""; // Initialize the Grade variable
        System.out.println("Enter student's marks for the subjects (Maths, Physics, Chemistry, Hindi, English):");
        int Maths = sc.nextInt();
        int Physics = sc.nextInt();
        int Chemistry = sc.nextInt();
        int Hindi = sc.nextInt();
        int English = sc.nextInt();

        int sum_marks = Maths + Physics + Chemistry + Hindi + English;

        float Average_percentage = (float) sum_marks / 5; // Use float division

        if (Average_percentage >= 90 && Average_percentage <= 100) {
            Grade = "O";
        } else if (Average_percentage >= 80 && Average_percentage <= 89) {
            Grade = "A+";
        } else if (Average_percentage >= 70 && Average_percentage <= 79) {
            Grade = "A";
        } else if (Average_percentage >= 60 && Average_percentage <= 69) {
            Grade = "B+";
        } else if (Average_percentage >= 50 && Average_percentage <= 59) {
            Grade = "B";
        } else if (Average_percentage >= 40 && Average_percentage <= 49) {
            Grade = "C";
        } else if (Average_percentage >= 30 && Average_percentage <= 39) {
            Grade = "P";
        } else if (Average_percentage >= 0 && Average_percentage <= 29) {
            Grade = "F";
        }

        System.out.println("*** Score Card of The Student ***");
        System.out.println("Total marks: " + sum_marks);
        System.out.println("Percentage is: " + Average_percentage);
        System.out.println("Grade is: " + Grade);
        System.out.println("Thank You..");

        sc.close(); // Close the scanner
    }
}
