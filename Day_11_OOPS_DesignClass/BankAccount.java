package TrainigChetu.Day_11_OOPS_DesignClass;

public class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    private static String bankName="Chetu Bank";

    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    public void depositAmount(double amount){
        balance+=amount;
        System.out.println( amount + " deposited. Balance :"+balance);
    }
    public void withdrawAmount(double amount){
        if (amount>balance)
            System.out.println("Insufficient Amount:");
        else{
            balance-=amount;
            System.out.println(amount +" withdraw Balance is Remaning :"+balance);
        }
    }

    static void main() {
        BankAccount bank=new BankAccount(12334, "Sufiyan",2000);
        bank.depositAmount(1000);
        bank.withdrawAmount(1500);
    }
}
