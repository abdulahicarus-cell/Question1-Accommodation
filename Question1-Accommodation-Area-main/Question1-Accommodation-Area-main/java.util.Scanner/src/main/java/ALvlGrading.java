import java.util.Scanner;

public class ALvlGrading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Part (d): Using a while loop for 5 students and summary
        int[] gradeCount = new int[10]; // Indices 1 to 9 will be used
        int studentCount = 1;

        while (studentCount <= 5) {
            System.out.print("\nEnter score for student " + studentCount + " (0-100): ");
            int score = scanner.nextInt();

            int grade;
            String remark;

            // Part (c): if-else-if control structure
            if (score >= 80 && score <= 100) {
                grade = 1;
                remark = "Distinction";
            } else if (score >= 75 && score <= 79) {
                grade = 2;
                remark = "Distinction";
            } else if (score >= 66 && score <= 74) {
                grade = 3;
                remark = "Credit";
            } else if (score >= 60 && score <= 65) {
                grade = 4;
                remark = "Credit";
            } else if (score >= 50 && score <= 59) {
                grade = 5;
                remark = "Credit";
            } else if (score >= 45 && score <= 49) {
                grade = 6;
                remark = "Credit";
            } else if (score >= 35 && score <= 44) {
                grade = 7;
                remark = "Pass";
            } else if (score >= 30 && score <= 34) {
                grade = 8;
                remark = "Pass";
            } else if (score >= 0 && score <= 29) {
                grade = 9;
                remark = "Fail";
            } else {
                System.out.println("Invalid score! Please enter a value between 0 and 100.");
                continue; // Skip the rest of the loop for this invalid entry
            }

            // Part (c): Display the result for the student
            System.out.printf("Score: %d | Grade: %d | Remark: %s\n", score, grade, remark);

            // Part (d): Update the grade count summary
            gradeCount[grade]++;
            studentCount++;
        }

        // Part (d): Display the summary
        System.out.println("\n--- GRADE SUMMARY ---");
        for (int g = 1; g <= 9; g++) {
            System.out.println("Grade " + g + ": " + gradeCount[g] + " student(s)");
        }
        scanner.close();
    }
}