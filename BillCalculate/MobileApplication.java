package TrainigChetu.BillCalculate;

import java.util.Scanner;

class MobileDataPlan {
    private long mobileNumber;
    private int dataUsed;
    private double billAmount = 0.0;

    public void accept(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Mobile Number:");
         mobileNumber=scanner.nextLong();

        System.out.println("Enter Data Used (in GB)");
        dataUsed=scanner.nextInt();
    }
    // calculate Bill

    public void calculateBill(){
        if (dataUsed<=10)
            billAmount=dataUsed*20;
        else if (dataUsed<=30)
            billAmount=(10*20) +(dataUsed-10)*15;
        else billAmount=(10*20)+(20*15)+(dataUsed-30)*10;
    }
    // display Result
    public void displayDetails(){
        System.out.println("=========Mobile Data Plan======");
        System.out.println("Mobile Number:"+mobileNumber);
        System.out.println("Data Used :"+dataUsed);
        System.out.println("Bill Amount :"+billAmount);
        System.out.println("-----------------------");
    }
}
public class MobileApplication {
    static void main() {
        MobileDataPlan mb=new MobileDataPlan();
        mb.accept();
        mb.calculateBill();
        mb.displayDetails();
    }
}
