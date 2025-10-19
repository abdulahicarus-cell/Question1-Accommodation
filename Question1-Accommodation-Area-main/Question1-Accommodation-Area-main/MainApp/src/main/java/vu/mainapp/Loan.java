package vu.mainapp;

public abstract class Loan {
    // i) Data members
    private String loan_id;
    private String loan_type;
    private double amount;
    private String customer_name;

    // ii) Default no-arg constructor
    public Loan() {
        this.amount = 0.0;
    }

    // iii) Set methods for loan_id and cust_name
    public void setLoanId(String loan_id) {
        this.loan_id = loan_id;
    }
    public void setCustomerName(String customer_name) {
        this.customer_name = customer_name;
    }

    // iv) Get methods for loan_id and cust_name
    public String getLoanId() {
        return loan_id;
    }
    public String getCustomerName() {
        return customer_name;
    }

    // v) Method to set loan amount
    public void setAmount(double amount) {
        this.amount = amount;
    }

    // vi) Method to return loan amount
    public double getAmount() {
        return amount;
    }

    // vii) Abstract method for loan type
    public abstract String getLoanType();
}