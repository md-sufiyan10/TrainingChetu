package TrainigChetu.LogicalProgram_02;

import java.util.Scanner;

public class _10SumGivenNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Number:");
        int n = scanner.nextInt();

        int number = n;
        int sum = 0;
        int rem;
          // First Sum
        while (number != 0) {
            rem = number % 10;
            sum = sum + rem;
            number = number / 10;
        }
        System.out.println("Sum Number is: " + sum);
        // Second Sum : seprate digit of sum like if sum is 10 then again 1+0=> 1

        int first=sum / 10;
        int second=sum%10;
        int newsum=first+second;
        System.out.println("Again New Sum is:"+newsum);

        scanner.close();
    }
}
