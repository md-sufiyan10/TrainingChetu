package ExceptionHandling;

class InsufficientBalance extends RuntimeException{
    InsufficientBalance(double amount , double balance){
        super("Needed: "+amount+" Available: "+balance);
    }
}
class BankAccount{
    double balance=1000;
    void withdraw(double amount) throws InsufficientBalance {
        if (amount>balance)
            throw new InsufficientBalance(amount,balance);
        balance-=amount;
    }
}
public class CustomeException {
    static void main() {
   BankAccount acc=new BankAccount();
    try{
        acc.withdraw(1500);
    }catch (InsufficientBalance e){
        System.out.println("Error : "+e.getMessage());
    }
    }
}
