package TrainigChetu.LogicalProgram_02;

import java.util.Scanner;

// Automorphic number =
      //  A number whose square ends with the same digits as the number itself: ex 25 -> 625  end 25
public class _12AutomorphicNumber {
    static void main() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n=scanner.nextInt();
        int square=n*n;
        int l=(""+n).length();  // Find number of digits in n

        int ends= square%(int) Math.pow(10,l);  // Get last l digits of square

        // Check Automorphic condition
        if (n==ends) {
            System.out.println(n + " is an Automorphic number");
            System.out.println("Because " + n+ " square is " + square + " and it ends with " + n);
        }
        else {
            System.out.println(n + " is NOT an Automorphic number");
            System.out.println("Because " + n + " square is " + square + " and it does not end with " + n);
        }

        scanner.close();

    }
}
