package TrainigChetu.AssignmentOOPS;

abstract class BankAccount
{
    private double balance;
    BankAccount(double balance){
        this.balance=balance;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if (amount<0){
            System.out.println("Invalid Amount:=>");
            return;
        }
        balance+=amount;
        System.out.println("Deposit Amount Successfully.."+amount);
    }
    protected void deduct(double amount){
        balance-=amount;
    }
    abstract void withdraw(double amount);
}
class SavingAcct extends BankAccount{
    private final double minimumBalance;

    SavingAcct(double balance,double minimumBalance) {
        super(balance);
        this.minimumBalance = minimumBalance;
    }
    @Override
    void withdraw(double amount) {
        if (amount<=0){
            System.out.println("Invalid Withdraw Amount:=>");
            return;
        }
        double remaining=getBalance()-amount;
        if (remaining<minimumBalance){
            System.out.println("Insufficient Balance:=>"+minimumBalance);
            return;
        }
        deduct(amount);
        System.out.println("Withdraw Amount Successfully.."+amount +" ,Balance Remaining:=>"+getBalance()+"");
    }
}
public class Problem_25_AbstractAccount {
    static void main() {
        BankAccount acc=new SavingAcct(1000,500);
        acc.deposit(500);
        acc.withdraw(1000);
       // acc.withdraw(1000); // fail
        System.out.println("Final Balance:=>"+acc.getBalance()+"");

    }
}
