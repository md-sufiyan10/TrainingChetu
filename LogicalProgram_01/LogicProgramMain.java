package TrainigChetu.LogicalProgram_01;

import java.util.Scanner;

public class LogicProgramMain {
   static void main() {

        Scanner sc = new Scanner(System.in);
        int choice;
        while (true) {

            System.out.println("\nWelcome to Logic Programs");
            System.out.println("1. Armstrong Number");
            System.out.println("2. Palindrome Number");
            System.out.println("3. Fibonacci Series");
            System.out.println("4. Prime Number");
            System.out.println("5. Exit the Application");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter a Number to Check Armstrong Number: ");
                    int num = sc.nextInt();
                    boolean result = ArmstrongNumber.isArmstrong(num);
                    if (result)
                        System.out.println(num + " : is Armstrong Number");
                    else
                        System.out.println(num + " : is NOT Armstrong Number");
                }
                case 2->{
                    System.out.println("Enter a Number to Check palindromeNumber:");
                    int num=sc.nextInt();
                   boolean isPalindrome = PalindromeNumber.isPalindrome(num);
                   if (isPalindrome )
                       System.out.println("Your Number is Palindrome:"+num);
                   else System.out.println("Your number is not a palindrome number:"+num);
                }
                case 3 -> {
                    System.out.print("Enter number of terms: ");
                    int n = sc.nextInt();
                    FibonacciSeries.Fibonacci(n);
                }
                case 4->{
                    System.out.println("Enter a Number to Find Prime Number:");
                    int num=sc.nextInt();
                 boolean isPrime=   PrimeNumber.isPrimeNumber(num);
                 if (isPrime) System.out.println(num+ " is a Prime Number");
                 else System.out.println(num + " is not a Prime Number");
                }
                case 5 -> {
                    System.out.println("Thank you for using the application 🙏");
                    sc.close();
                    return;
                }

                default -> System.out.println("Invalid choice, try again!");
            }
        }
    }
}
