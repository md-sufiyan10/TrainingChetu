package ExceptionHandling;

public class CheckedCustomExceptionDemo {

    static class paymentFail extends Exception{

        public paymentFail(String msg){
            super(msg);
        }
    }

    static void makePayment(double amount, double walletBalance) throws paymentFail {
        if(amount<=0)
            throw new paymentFail("Amount must be > 0 , provided:"+amount);
        if(amount>walletBalance)
            throw new paymentFail("Insufficient Balance. Needed :" +amount +", Available:"+walletBalance);

        System.out.println("Payment Successful"+amount);
    }

    static void main() {
        try{
           makePayment(500,200);
        }catch(paymentFail e) {
            System.out.println("Payment Failed :"+e.getMessage());
        }
    }

}
