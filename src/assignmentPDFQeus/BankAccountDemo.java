package TrainigChetu.src.assignmentPDFQeus;

class Account{
    private double balance;

    public Account(double balance){
        this.balance=balance;
    }
    public void deposit(double amount){
        if (amount<=0) {
            System.out.println("Invalid Amount" + amount);
            return;
        }
            balance+=amount;
        System.out.println("Amount Deposited Successfully."+amount);
    }
    public double getBalance(){
        return balance;
    }
    protected void addToBalance (double amount){
        balance+=amount;
    }
}
class SavingsAccount extends Account{
    private double interestRate=0.05;

    public SavingsAccount(double balance, double interestRate){
        super(balance);
        this.interestRate=interestRate;
    }
    @Override
    public void deposit(double amount) {
        System.out.println("Saving Amount Deposited Successfully.");
         super.deposit(amount);
    }
    public void addMonthlyInterested(){
        double interest=getBalance()*interestRate;
        addToBalance(interest);
        System.out.println("Monthly Interest Added Successfully."+interest);
    }
}
public class BankAccountDemo {
    static void main() {

        Account acc=new SavingsAccount(1000.0,0.05);
        acc.deposit(500);

        if (acc instanceof SavingsAccount sa){
            sa.addMonthlyInterested();
        }
        System.out.println("Final Balance: "+acc.getBalance()+"");
    }
}
