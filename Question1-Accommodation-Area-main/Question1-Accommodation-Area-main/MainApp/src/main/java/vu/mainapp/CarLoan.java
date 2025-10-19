package vu.mainapp;

public class CarLoan extends Loan {
    // i) Variable car_lien
    private boolean car_lien;

    // ii) No-arg constructor
    public CarLoan() {
        super(); // Calls parent constructor
        // loan_id, cust_name, amount can be set via setter methods
    }

    // iii) Method to assign value to the lien
    public void setCarLien(boolean lien) {
        this.car_lien = lien;
    }

    // iv) Method to return the value of the lien
    public boolean getCarLien() {
        return car_lien;
    }

    // Implementing the abstract method from Loan
    @Override
    public String getLoanType() {
        return "Car Loan";
    }
}