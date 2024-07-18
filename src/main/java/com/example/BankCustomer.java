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
    double totalAmountDeposited;
    static String bankName = "First_Bank";

    public double calTotalAmountDeposited()
    {
        return transactionAmount1 + transactionAmount2 + transactionAmount3;
    }
    public void display()
    {
        System.out.println("customerId" + "= " + customerId +
                ", customerName" + "= " + customerName +
                ", AccountNumber" + "= " + accountNumber +
                ", Balance" + "= " + balance +
                ", AccountType" + "= " + accountType +
                ", PhoneNumber" + "= " + phoneNumber +
                ", TransactionAmount1" + "= " + transactionAmount1 +
                ", TransactionAmount2" + "= " + transactionAmount2 +
                ", TransactionAmount3" + "= " + transactionAmount3 +
                ", Bank Name" + "= " + bankName+
                ", Total" + "=" + totalAmountDeposited);
    }
}
