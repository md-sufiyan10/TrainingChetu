package TrainigChetu.Day_5;

import java.util.Scanner;

public class _07PatternPrint {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number Rows:");
        int rows=sc.nextInt();
        System.out.println("--------------");
        for (int i=1; i<=rows ; i++)
        {
            for (int j=rows-1; j>=i ; j--)
            {
                System.out.print(" ");
            }
            for (int k=1 ; k<=i ; k++)
            {
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }
    }
}
