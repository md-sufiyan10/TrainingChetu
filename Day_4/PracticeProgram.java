package TrainigChetu.Day_4;

import java.util.Scanner;

public class PracticeProgram {
    static void main() {
     Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num=scanner.nextInt();
        reverseNumber(num);

        // EvenOdd(12);
    }

    public static void EvenOdd(int num){
        System.out.println("Welcome to calculate Even Odd:");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n=scanner.nextInt();

        if (n%2==0)
            System.out.println("EVen Number:"+n);
        else
            System.out.println("Odd Number:"+n);
    }

    public static void reverseNumber(int n){
     int newNum=0; int sum=0;
     while (n>0){
         int digit=n%10;

         newNum=newNum*10+digit;
         n=n/10;
         sum=sum+digit;
     }
        System.out.println("Sum of the Given nUmber is:"+sum);
        System.out.println("Reverse Number is:"+newNum);
    }

    
}
