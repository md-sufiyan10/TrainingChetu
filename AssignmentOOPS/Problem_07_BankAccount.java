package TrainigChetu.AssignmentOOPS;
class Account{
    protected double balance;
    Account(double balance){
        this.balance=balance;
    }
    void depositAmount(double amount){
        balance+=amount;
        System.out.println("Deposit Amount is:"+ amount);
        System.out.println("Balance Amount is :"+balance);
    }
}
class SavingAccount extends Account{
    private double interestRate;
    SavingAccount(double balance, double interestRate){
        super(balance);
        this.interestRate=interestRate;
    }
    void depositAmount(double amoun){
        super.depositAmount(amoun);
        double interest = balance * interestRate/100;
        balance+=interest;
        System.out.println("Interested Added :"+interest);
        System.out.println("Now Final Amount is :"+balance);
    }
}
public class Problem_07_BankAccount {
    static void main() {
    Account account=new SavingAccount(1000, 5);
    account.depositAmount(500);
    }
}
