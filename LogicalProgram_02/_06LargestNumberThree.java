package TrainigChetu.LogicalProgram_02;

import java.util.Scanner;

public class  _06LargestNumberThree {
    static void main() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter First Number:");
        int n1=scanner.nextInt();
        System.out.println("Enter Second Number:");
        int n2=scanner.nextInt();
        System.out.println("Enter Third Number:");
        int n3=scanner.nextInt();

        if (n1 > n2 && n1 > n3)
            System.out.println("First Number is Greater:"+n1);
        else if(n2>n1 && n2>n3)
            System.out.println("Second Number is Greater:"+n2);
        else
            System.out.println("Third Number is Greater :"+n3);
    }
}
