import java.util.Scanner;
public class GPACalculator {
    // The main method is the entry point for the program
    public static void main(String[] args) {
        // Create a new Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        // The user's GPA is initially set to 0.0
        System.out.print("Enter number of subjects: ");
        int numSubjects = scanner.nextInt();
        // The number of subjects is stored in numSubjects variable
        double totalGradePoints = 0;
        int totalCredits = 0;
        // The grade points for each letter grade
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter grade points for subject " + i + " (e.g., 4.0 for A): ");
            double gradePoints = scanner.nextDouble();
            // The grade points for each subject is stored in gradePoints variable
            System.out.print("Enter credit hours for subject " + i + ": ");
            int credits = scanner.nextInt();
            // The grade points and credits for each subject are stored in gradePoints and credits variables
            totalGradePoints += gradePoints * credits;
            totalCredits += credits;
        }
        // The loop is done, now calculate the GPA
        double gpa = totalGradePoints / totalCredits;
        System.out.printf("Your GPA is: %.2f\n", gpa);
    }
}
