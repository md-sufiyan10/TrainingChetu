package TrainigChetu.src.assignmentPDFQeus;

//class Account{
//    private double balance=100;
//
//    void deposit(double amount){
//        if (amount<=0){
//            throw new IllegalArgumentException("Invalid Amount");
//        }
//        balance+=amount;
//    }
//    double getBalance(){
//        return balance;
//    }
//}

class P{
    int x=10;
}
class C extends P{
    int x=20;
    void print(){
        System.out.println( x+ " "+super.x);
    }
}
public class Test_02 {
    static void main() {
//        Account acc=new Account();
//        acc.deposit(-50);
        new C().print();
    }
}
