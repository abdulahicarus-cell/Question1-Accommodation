import java.util.Scanner;

public class MirrorFocalLength {
    public static void main(String[] args) {
        // i) Accept object and image distances
        try (Scanner scanner = new Scanner(System.in)) {
            // i) Accept object and image distances
            System.out.print("Enter the object distance (u) in cm: ");
            double u = scanner.nextDouble();
            u = -Math.abs(u); // Ensure u is negative for concave mirror
            
            System.out.print("Enter the image distance (v) in cm: ");
            double v = scanner.nextDouble();
            
            // ii) Calculate focal length using mirror formula
            double f = 1 / ((1 / v) + (1 / u));
            
            // iii) Display result and check acceptability
            System.out.printf("The calculated focal length is: %.2f cm\n", f);
            
            if (f >= 21.0 && f <= 25.0) {
                System.out.println("This mirror is ACCEPTABLE for the WAKISHA MOCK Exams.");
            } else {
                System.out.println("This mirror is NOT ACCEPTABLE for the WAKISHA MOCK Exams.");
            }
        }
    }
}