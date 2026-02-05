package BankApp;

import java.util.Scanner;

class BankAccount{
    private double balance; // data hiding

    BankAccount(){
        balance=0;
    }
    public void checkBalance(){
        System.out.println("Current Balance is :"+balance+" Rs.");
    }
    public void depositAmount(double amount){
        if (amount>0){
            balance=balance+amount;
            System.out.println("Deposit Amount Successfully..");
            System.out.println("Now Current Amount is:"+balance);
        }else
            System.out.println("Invalid Amount : please Enter Correct Amount=>");
    }
    public void withdrawAmount(double amount){
        if (amount > 0 && amount <=balance){
            balance=balance-amount;
            System.out.println("Withdraw Amount Successfully..");
            System.out.println("So Now Remaining Amount is:"+balance);
        }else if (amount<=0)
            System.out.println("Invalid Amount:=>");
        else
            System.out.println("Insufficient Balance =>");
    }
}

public class BankApplication_03 {
    static void main() {
        Scanner scanner=new Scanner(System.in);
        BankAccount account=new BankAccount();  // object Creation

        while (true)
        {
            System.out.println("========Bank Application==========");
            System.out.println(" 1. Checking Balance");
            System.out.println(" 2.  Deposit Amount");
            System.out.println(" 3.  Withdraw Amount");
            System.out.println(" 4. Exist Application");
            System.out.println(" Enter option :=>");
            int choice= scanner.nextInt();
            switch (choice)
            {
                case 1-> account.checkBalance();
                case 2-> {
                    System.out.println("Enter Amount for Deposit.");
                    double amt=scanner.nextDouble();
                    account.depositAmount(amt);
                }
                case 3->{
                    System.out.println("Withdraw Amount:");
                    double amt=scanner.nextDouble();
                    account.withdrawAmount(amt);
                }
                case 4->{
                    System.out.println("Thank So much Using My Application:");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid Number please input correct number like between 1 and 4  :");
            }
        }

    }
}
