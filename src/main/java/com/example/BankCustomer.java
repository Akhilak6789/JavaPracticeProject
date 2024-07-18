package com.example;

public class BankCustomer {
    int customerId;
    String customerName;
    long accountNumber;
    long balance;
    String accountType;
    long phoneNumber;
    double transactionAmount1;
    double transactionAmount2;
    double transactionAmount3;
    double totalAmountDeposited; // Changed from Double to double
    static String bankName;

    public double calTotalAmountDeposited() {
        return transactionAmount1 + transactionAmount2 + transactionAmount3;
    }

    public static void main(String[] args) {
        BankCustomer bc1 = new BankCustomer();

        bc1.customerId = 123;
        bc1.customerName = "aslasha";
        bc1.accountNumber = 12345L;
        bc1.balance = 600000000L;
        bc1.accountType = "Checking";
        bc1.phoneNumber = 953349097L;
        bc1.transactionAmount1 = 900000;
        bc1.transactionAmount2 = 950000;
        bc1.transactionAmount3 = 1000000;

        double total = bc1.calTotalAmountDeposited();
        bc1.totalAmountDeposited = total;

        bc1.display();

        System.out.println("------------------------");

        BankCustomer bc2 = new BankCustomer();

        bc2.customerId = 133;
        bc2.customerName = "asha";
        bc2.accountNumber = 12335L;
        bc2.balance = 500000000L;
        bc2.accountType = "Checking";
        bc2.phoneNumber = 954535909L;
        bc2.transactionAmount1 = 100000;
        bc2.transactionAmount2 = 950000;
        bc2.transactionAmount3 = 1000000;

        total = bc2.calTotalAmountDeposited();
        bc2.totalAmountDeposited = total;

        bc2.display();
    }

    public void display() {
        System.out.println(customerName + " - " + balance);
    }
}
