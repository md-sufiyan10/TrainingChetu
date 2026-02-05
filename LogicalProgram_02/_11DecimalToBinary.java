package TrainigChetu.LogicalProgram_02;

import java.util.Scanner;

public class _11DecimalToBinary {
    static void main() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Decimal Number:");
        int number=scanner.nextInt();
        int originalNumber=number;
        String binary="";
        int rem;

        while (number>0){
            rem=number%2;
            binary=rem+binary;
            number=number/2;
        }
        System.out.println("Binary of Original Number "+originalNumber+ " is => "+binary);
          scanner.close();
    }
}
