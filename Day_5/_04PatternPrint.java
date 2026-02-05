package TrainigChetu.Day_5;

import java.util.Scanner;

public class _04PatternPrint {
    static void main() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Rows:");

        int rows=scanner.nextInt();
        System.out.println("----------------");

           // 1. using for loop : Entry Controlled Loop
//        for (int i=1 ; i<=rows; i++){
//            for (int j=1; j<=i; j++){
//                System.out.printf( k+" ");
//                k++;
//            }
//            System.out.println(" ");
//        }
        // 2 . using while loop : Entry Controlled Loop
//         int k=1; int i=1;
//         while(i<=rows){
//             int j=1;
//             while (j<=i){
//                 System.out.printf(k+" ");
//                 j++;
//                 k++;
//             }
//             System.out.println(" ");
//             i++;
//         }

        // 3 . using do-while i.e Exit Controlled Loop
          int k=1; int i=1;
        System.out.println("Floyd's Triangle using do-while:");
        // Outer do-while loop (for rows)

        do{
            int j=1;
            // inner do while loop for column
            do{
                System.out.print(k+" ");
                j++;
                k++;
            }while(j<=i);  // Condition checked AFTER executing loop body
            System.out.println(" ");
            i++;
        }while(i<=rows);

    }
}
