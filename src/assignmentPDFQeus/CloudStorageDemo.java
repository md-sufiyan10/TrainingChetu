package TrainigChetu.src.assignmentPDFQeus;

// CloudStorageDemo.java
import java.util.Scanner;

class CloudStorage {
    // Member Variables
    int acno;        // user's account number
    int space;       // storage space in GB
    double bill;     // total bill amount

    // Member Methods
    void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        acno = sc.nextInt();

        System.out.print("Enter Storage Space (in GB): ");
        space = sc.nextInt();
    }

    void calculate() {
        if (space <= 0) {
            bill = 0;
            return;
        }

        int remaining = space;
        bill = 0;

        // First 15 GB -> Rs 15 per GB
        int firstSlab = Math.min(remaining, 15);
        bill += firstSlab * 15;
        remaining -= firstSlab;

        // Next 15 GB (16 to 30) -> Rs 13 per GB
        if (remaining > 0) {
            int secondSlab = Math.min(remaining, 15);
            bill += secondSlab * 13;
            remaining -= secondSlab;
        }

        // Above 30 GB -> Rs 11 per GB
        if (remaining > 0) {
            bill += remaining * 11;
        }
    }

    void display() {
        System.out.println("\n----- Cloud Storage Bill Details -----");
        System.out.println("Account Number : " + acno);
        System.out.println("Storage Space  : " + space + " GB");
        System.out.println("Total Bill     : Rs. " + bill);
    }
}

public class CloudStorageDemo {
    public static void main(String[] args) {
        CloudStorage cs = new CloudStorage();
        cs.accept();
        cs.calculate();
        cs.display();
    }
}
