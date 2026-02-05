package TrainigChetu.LogicalProgram_02;

import java.util.Scanner;

public class _04SumGreaterFifty {
    static void main() {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter First Number:");
        int n1=scanner.nextInt();
        System.out.println("Enter Second Number:");
        int n2=scanner.nextInt();

        int sum=n1+n2;
        if (sum>=50)
            System.out.println("What Print Don't Know:");
        else
            System.out.println("Nothing there:");
    }
}
