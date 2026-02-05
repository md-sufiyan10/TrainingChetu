package BankApp;

import java.util.Scanner;

public class BankApplication_02 {

    static Scanner s = new Scanner(System.in);
    static double balance = 0;   // shared balance

    public static void main(String[] args) {

        int choice;

        while (true) {
            System.out.println("\n===== USING MY BANK APPLICATION  =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Amount");
            System.out.println("3. Withdraw Amount");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = s.nextInt();

            switch (choice) {
                case 1 -> CheckingBalance();
                case 2 -> DepositAmount();
                case 3 -> WithdrawAmount();
                case 4 -> {
                    System.out.println("Thank you for using Bank Application:");
                    s.close();
                    return;
                }
                default -> System.out.println("Invalid Choice! Please select 1 to 4.");
            }
        }
    }

    // 1️ Checking Balance
    static void CheckingBalance() {
        System.out.println("Current Balance: " + balance + " Rs");
    }

    // 2️. Deposit Amount
    static void DepositAmount() {
        System.out.print("Enter Amount to Deposit: ");
        double amount = s.nextDouble();

        if (amount > 0) {
            balance += amount;
            System.out.println("Amount Deposited Successfully.");
            System.out.println("Now Current Amount is:"+balance);
        } else {
            System.out.println("Invalid Amount! Please enter positive Amount.");
        }
    }

    // 3 Withdraw Amount--->
    static void WithdrawAmount() {
        System.out.print("Enter Amount to Withdraw: ");
        double withdraw = s.nextDouble();

        if (withdraw > 0 && withdraw <= balance) {
            balance -= withdraw;
            System.out.println("Amount Withdrawn Successfully.");
            System.out.println("Remaining Balance: " + balance);
        } else if (withdraw <= 0) {
            System.out.println("Invalid Amount!");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
}
