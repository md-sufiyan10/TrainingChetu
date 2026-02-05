package BankApp;

import java.util.Scanner;

public class BankApplication_01 {
    static void main() {
        Scanner s=new Scanner(System.in);
        double balance=0;
        int choice;
        while(true) {
            System.out.println("Enter Choice Option using in Below Bank Application");
            System.out.println(" 1 . Checking Balance:");
            System.out.println(" 2 . Deposit Amount:");
            System.out.println(" 3 . Withdraw balance:");
            System.out.println(" 4 . Exist Bank Application:");

            System.out.println("Enter you choice Option:");
            choice = s.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Current Balance is :" + balance + " Rs:");
                    break;
                case 2:
                    System.out.println("Enter Amount to Deposit:");
                    double deposit = s.nextDouble();
                    if (deposit > 0) {
                        balance = balance + deposit;
                        System.out.println("Amount Deposit Successfully...");
                        System.out.println("So Now Current Balance is :" + balance);
                    } else
                        System.out.println("Invalid Amount : Please Enter positive Amount.");
                    break;

                case 3:
                    System.out.println("Enter Amount to Withdraw:");
                    double withdraw = s.nextDouble();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance = balance - withdraw;
                        System.out.println("Amount Withdraw Successfully...");
                        System.out.println("So Now : Remaining Balance is:"+balance);
                    } else if (withdraw <= 0)
                        System.out.println("Invalid Amount: Please Enter Correct Amount..");
                    else
                        System.out.println("Insufficient Balance:");
                    break;
                case 4:
                    System.out.println("Thanku So Much Using My Bank Application:");
                    s.close();
                    return;
                default:
                    System.out.println("Incorrect Option : Please input Range Between 1 and 4.");
            }
            System.out.println("-----------------------------------------");
        }
    }
}
