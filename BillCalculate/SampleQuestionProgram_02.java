package TrainigChetu.BillCalculate;

import java.util.Scanner;
public class SampleQuestionProgram_02 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        StorageSpaces storage = null;

        while(true){
            System.out.println("\n====== Welcome to Invoice Bill.=====");
            System.out.println("1. accept");
            System.out.println("2. calculate");
            System.out.println("3. display");
            System.out.println("4. Exist Application");

            System.err.println("Plz Enter your choice:=== ");
            int choice = sc.nextInt();

            switch (choice){
                case 1->{
                    System.out.println("Enter Account Number:");
                    int account=sc.nextInt();

                    System.out.println("Enter Storage Space GB:");
                    int space=sc.nextInt();

                    System.err.println("Data Accepted Successfully..");
                    storage=new StorageSpaces(account,space);
                }
                case 2-> {
                    if (storage== null)
                        System.err.println("Plz enter details first (option 1)");
                    else {
                        storage.calculateBill();
                        System.err.println("Bill Calculated Successfully.");
                    }
                }
                case 3-> {
                    if (storage == null)
                        System.err.println("No Data Found ! Plz enter Details First..");

                    else {
                        storage.display();
                    }
                }
                case 4 -> {
                    System.out.println("Existing Application..");
                    sc.close();
                    return;
                }
                default -> System.out.println("Invalid Option: ply try valid Input");
            }
        }
    }
}
