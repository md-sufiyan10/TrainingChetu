package BillCalculate;

import java.util.Scanner;

public class ParkingApplication {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Vehicle Number:");
        String vehicleNo=sc.next();
        System.out.println("Enter Parking Horse:");
        int hrs=sc.nextInt();

        ParkingCharge p=new ParkingCharge(vehicleNo,hrs);
        p.display();
    }
}
