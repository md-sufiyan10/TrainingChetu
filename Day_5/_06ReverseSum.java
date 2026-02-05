package TrainigChetu.Day_5;

import java.util.Scanner;

public class _06ReverseSum {
    static void main() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num=scanner.nextInt();
        sumForLoop(num);
        System.out.println("-----------------");
        sumWhileLoop(num);
        System.out.println("--------------");
        sumDoWhileLoop(num);
    }
   public  static void sumForLoop(int num){
       System.out.println("Using For Loop...");
            int sum=0;
            for (int i=num; i>=1 ; i--){
                sum=sum+i;
                if (i>1)
                    System.out.print(i+" + ");
                else
                    System.out.print(i);
            }

            System.out.println("=>"+sum);
    }

    public static void sumWhileLoop(int num){
        System.out.println("Using While-For Loop...");
        int sum=0; int i=num;
        while (i>=1){
            sum+=i;
            if (i>1)
                System.out.print(i+" + ");
            else
                System.out.print(i);
            i--;
        }
        System.out.println("=>"+sum);
    }

    public static void sumDoWhileLoop(int num){
        System.out.println("Using Do-While For Loop...");
        int sum=0;  int i=num;
        do{
          sum+=i;
          if (i>1)
              System.out.print(i+" + ");
          else
              System.out.print(i);
            i--;
        }while(i>=1);
        System.out.println("=>"+sum);


    }

}
