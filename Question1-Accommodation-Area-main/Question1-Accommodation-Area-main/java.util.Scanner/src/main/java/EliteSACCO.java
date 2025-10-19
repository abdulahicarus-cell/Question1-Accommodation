import java.util.Scanner;

public class EliteSACCO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double interestRate = 0.05; // 5%
        int timePeriod;

        System.out.print("Enter the number of years for investment: ");
        timePeriod = scanner.nextInt();

        // (i) Using a For Loop
        System.out.println("\n--- Calculating using FOR loop ---");
        for (int i = 1; i <= 3; i++) { // Assuming 3 teachers for the example
            System.out.print("Enter principal amount for teacher " + i + ": ");
            double principal = scanner.nextDouble();
            double futureValue = principal * Math.pow(1 + interestRate, timePeriod);
            System.out.printf("Teacher %d's investment will be: UGX %.2f\n", i, futureValue);
        }

        // (ii) Using a While Loop
        System.out.println("\n--- Calculating using WHILE loop ---");
        int count = 1;
        while (count <= 3) { // Assuming 3 teachers for the example
            System.out.print("Enter principal amount for teacher " + count + ": ");
            double principal = scanner.nextDouble();
            double futureValue = principal * Math.pow(1 + interestRate, timePeriod);
            System.out.printf("Teacher %d's investment will be: UGX %.2f\n", count, futureValue);
            count++;
        }
        scanner.close();
    }
}