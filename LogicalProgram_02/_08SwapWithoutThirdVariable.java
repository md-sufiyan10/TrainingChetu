package TrainigChetu.LogicalProgram_02;

import java.util.Scanner;

public class _08SwapWithoutThirdVariable {
    static void main() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first Number:");
        int a=scanner.nextInt();
        System.out.println("Enter Second Number:");
        int b= scanner.nextInt();

        System.out.println("Before Swapping => " +" a : "+ a + " and b : "+b);
         a= a+b;
         b=a-b;
         a=a-b;
        System.out.println("After Swapping => " +" a : "+ a + " and b :"+b);

    }
}
