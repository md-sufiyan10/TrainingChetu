package TrainigChetu.Day_5;

import java.util.Scanner;

public class _05SumNumberPrint_Loop {
    static void main() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Natural Number :");
        int num=scanner.nextInt();

        // 1 . using for loop:
       // int sum=0;
//        for (int i=1 ; i<=num ; i++){
//            sum=sum+i;
//
//            if (i<num)
//                System.out.print( i + " + ");
//            else
//                System.out.print(i);
//        }
//        System.out.println(" => " + sum);

        // 2. using while loop
//        int i=1;int sum=0;
//        while(i<=num){
//            sum=sum+i;
//            if (i<5)
//                System.out.print(i+ " + ");
//            else
//                System.out.print(i);
//
//            i++;
//        }
//        System.out.println("=>"+sum);

        // 3 .using do-while loop
        int sum=0; int i=1;
        do{
          sum+=i;
          if (i<num)
              System.out.print(i+" + ");
          else
              System.out.print(i);
          i++;
        }while(i<=num);
        System.out.println("=>"+sum);
    }

}
