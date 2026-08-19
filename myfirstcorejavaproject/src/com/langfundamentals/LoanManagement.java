package com.langfundamentals;

public class LoanManagement {

    // Instance variables
    String customerName;
    double loanAmount;
    double interestRate;
    int loanTenure;

    // Constructor
    LoanManagement(String customerName, double loanAmount,
                   double interestRate, int loanTenure) {

        this.customerName = customerName;
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.loanTenure = loanTenure;
    }

    // Calculate Simple Interest
    double calculateInterest(double loanAmount, double interestRate) {

        double interest = (loanAmount * interestRate * loanTenure) / 100;

        return interest;
    }

    // Calculate Total Amount
    double calculateTotalAmount(double interest) {

        double totalAmount = loanAmount + interest;

        return totalAmount;
    }

    // Calculate Monthly EMI
    double calculateMonthlyEMI(double totalAmount, int loanTenure) {

        double emi = totalAmount / (loanTenure * 12);

        return emi;
    }

    // Display Loan Summary
    void displayLoanSummary(double interest, double totalAmount, double emi) {

        System.out.println("========================================");
        System.out.println("          LOAN SUMMARY");
        System.out.println("========================================");

        System.out.println("Customer Name       : " + customerName);
        System.out.println("Loan Amount         : " + loanAmount);
        System.out.println("Interest Rate       : " + interestRate + "%");
        System.out.println("Loan Tenure         : " + loanTenure + " Years");
        System.out.println("Interest            : " + interest);
        System.out.println("Total Amount        : " + totalAmount);
        System.out.println("Monthly EMI         : " + emi);

        System.out.println("========================================");
    }

    public static void main(String[] args) {

        // First Object
        LoanManagement l1 =
                new LoanManagement("Koti", 500000, 8.5, 5);

        System.out.println("\n******** LOAN DETAILS - CUSTOMER 1 ********");

        double interest1 =
                l1.calculateInterest(l1.loanAmount, l1.interestRate);

        double totalAmount1 =
                l1.calculateTotalAmount(interest1);

        double emi1 =
                l1.calculateMonthlyEMI(totalAmount1, l1.loanTenure);

        l1.displayLoanSummary(interest1, totalAmount1, emi1);


        // Second Object
        LoanManagement l2 =
                new LoanManagement("Ravi", 750000, 7.5, 10);

        System.out.println("\n******** LOAN DETAILS - CUSTOMER 2 ********");

        double interest2 =
                l2.calculateInterest(l2.loanAmount, l2.interestRate);

        double totalAmount2 =
                l2.calculateTotalAmount(interest2);

        double emi2 =
                l2.calculateMonthlyEMI(totalAmount2, l2.loanTenure);

        l2.displayLoanSummary(interest2, totalAmount2, emi2);
    }
}