package com.pluralsight.finance;

import java.util.Scanner;

public class BankAccount {
    String name;
    String accountNumber;

    double Balance;

    private void addDeposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter deposit amount: ");
        double Balance = scanner.nextDouble();

}}

