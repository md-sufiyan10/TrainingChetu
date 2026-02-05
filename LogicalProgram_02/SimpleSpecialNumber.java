package TrainigChetu.LogicalProgram_02;

import java.util.Scanner;

public class SimpleSpecialNumber {

    // 1 . Get Number from user
    static int getNumber(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Number:");
        return scanner.nextInt();
    }
    // 2 . Find Sum Digits
    static int sumDigit(int num){
        int sum=0;
        while (num>0){
            sum=sum+(num%10);
            num=num/10;
        }
        return sum;
    }
    // 3 . Find product of digits
    static int produntDigit(int num){
        int product=1;
        while(num>0){
            product=product*(num%10);
            num=num/10;
        }
        return product;
    }
    // 4 . Main Logic
    static void checkNumber(){
        int num=getNumber();  // calling Number

        // calculate logic
        int sum=sumDigit(num);
        int product=produntDigit(num);

        // display
        System.out.println("Number is :"+num);
        System.out.println("Sum of Digits:"+sum);
        System.out.println("Product Digit:"+product);

        // checking condition
        if (sum==product)
            System.out.println("YES ! This is Special Number:");
        else
            System.out.println("NO ! This is Not Special Number");
    }
    static void main() {
     checkNumber();
    }


}
