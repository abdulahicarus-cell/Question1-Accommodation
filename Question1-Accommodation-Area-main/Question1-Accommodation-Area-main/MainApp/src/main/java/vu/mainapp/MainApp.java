package vu.mainapp;


import vu.mainapp.CarLoan;

public class MainApp {
    public static void main(String[] args) {
        // i) Create car loan objects
        CarLoan loan1 = new CarLoan();
        CarLoan loan2 = new CarLoan();

        // ii) Assign values to their id, type (inherited), amount and name.
        loan1.setLoanId("CL001");
        loan1.setCustomerName("John Businge");
        loan1.setAmount(25000000.0);

        loan2.setLoanId("CL002");
        loan2.setCustomerName("Sarah Nalwoga");
        loan2.setAmount(15000000.0);

        // iii) Assign value to the car_lien for the car loans.
        loan1.setCarLien(true);
        loan2.setCarLien(true);

        // iv) Display all the values.
        displayLoanDetails(loan1);
        displayLoanDetails(loan2);
    }

    public static void displayLoanDetails(CarLoan loan) {
        System.out.println("\n--- Car Loan Details ---");
        System.out.println("Loan ID: " + loan.getLoanId());
        System.out.println("Customer Name: " + loan.getCustomerName());
        System.out.println("Loan Type: " + loan.getLoanType());
        System.out.printf("Loan Amount: UGX %,.2f\n", loan.getAmount());
        System.out.println("Car Lien Active: " + loan.getCarLien());
    }
}