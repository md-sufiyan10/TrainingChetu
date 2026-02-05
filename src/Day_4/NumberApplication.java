package Day_4;

import java.util.Scanner;

public class NumberApplication {
    static void main() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n=scanner.nextInt();

           int reverse=UtilityClass.reverseNumber(n);
        System.out.println("=========Result======");
        System.out.println("Original Number:"+n);
        System.out.println("Reverse Number:"+reverse);
        System.out.println("Sum of Digit:"+UtilityClass.sumOfDigit(n));
        System.out.println("Count of Digits:"+UtilityClass.countDigt(n));
        System.out.println("Largest Digit:"+UtilityClass.LargestDigit(n));
        System.out.println("Smallest Digit:"+UtilityClass.smallestDigit(n));
        System.out.println("Prime Number:"+UtilityClass.isPrimeDigit(n));
        System.out.println("Armstrong Number:"+UtilityClass.isArmstrong(n));
        System.out.println("Sum of Even Digits:"+UtilityClass.sumOfEveDigit(n));
        System.out.println("Sum of Odd Digits :"+UtilityClass.sumOfOddDigit(n));

        if (UtilityClass.isPalindrome(n))
            System.out.println("Palindrome      : YES" );
        else
            System.out.println("Palindrome       : NO");



    }
}
