package TrainigChetu.LogicalProgram_02;

import java.util.Scanner;

public class _09ElectricBill {
    static void main() {
       Scanner scanner=new Scanner(System.in);
        System.out.println("Enter total Amounts of Units:");
        int units=scanner.nextInt();

          double billCalculate= calculateBill(units);
        System.out.println("Total Electricity Bill : ₹ "+billCalculate);
        scanner.close();
    }
    static  double calculateBill(int units){
            double amount=0;
            if (units<=100)
                amount=units*2;
            else if (units<=200 & units>=100)
                amount=units*4;
            else
                amount=units*6;

        return amount;
    }
}
