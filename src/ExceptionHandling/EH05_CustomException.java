package ExceptionHandling;

class InsufficientBalanceException extends RuntimeException{
    InsufficientBalanceException(String msg){
        super(msg);
    }
}


public class EH05_CustomException {
    static void main(String[] args) {
        try{
            withdraw(500,700);
        }catch (InsufficientBalanceException e){
            System.out.println("Business Fail : "+e.getMessage());
        }
    }

    static void withdraw(int balance, int amount) {
        if(amount<=0){
            throw new InsufficientBalanceException("Amunt must be > 0 Balance");
        }
        if(amount>balance){
            throw new InsufficientBalanceException("Insufficient Balance");
        }
        System.out.println("Withdraw Successful"+amount);
    }

}
