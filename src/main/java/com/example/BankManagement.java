package com.example;

import java.util.Scanner;

public class BankManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankCustomer bc = new BankCustomer();

        System.out.println("Enter the Customer ID: ");
        bc.customerId = sc.nextInt();

        System.out.println("Enter the Customer Name: ");
        bc.customerName = sc.next();

        System.out.println("Enter the Account Number: ");
        bc.accountNumber = sc.nextLong();

        System.out.println("Enter the Balance: ");
        bc.balance = sc.nextLong();

        System.out.println("Enter the Account Type: ");
        bc.accountType = sc.next();

        System.out.println("Enter the Phone Number: ");
        bc.phoneNumber = sc.nextLong();

        System.out.println("Enter the Transaction Amount 1: ");
        bc.transactionAmount1 = sc.nextDouble();

        System.out.println("Enter the Transaction Amount 2: ");
        bc.transactionAmount2 = sc.nextDouble();

        System.out.println("Enter the Transaction Amount 3: ");
        bc.transactionAmount3 = sc.nextDouble();

        bc.totalAmountDeposited = bc.calTotalAmountDeposited();

        bc.display();

        sc.close();
    }

}