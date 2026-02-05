package TrainigChetu.Day_5;

import java.util.Scanner;

public class _09MultiplicationCustomeTable {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num=sc.nextInt();

        System.out.println("Enter Starting point (ex , 1): ");
        int start=sc.nextInt();

        System.out.println("Enter Ending point (ex , 10): ");
        int end=sc.nextInt();

        System.out.println("\n Choose Loop Type:");
        System.out.println("1 . For Loop");
        System.out.println("2 . While Loop");
        System.out.println("3 . Do-While Loop");

        System.out.println("Enter Choice:");
        int choice=sc.nextInt();

        System.out.println("\nTable from " +start + " to "+ end + " : ");
        System.out.println("--------------------------");

        switch (choice){
            case 1:
               // for Loop with custom range
                for (int i=start ; i<=end; i++){
                    System.out.println(num +" x " +i+ " = "+(num*i));
                }
                break;
            case 2:
                // While loop
                int i=start;
                while (i<=end){
                    System.out.println(num +" x "+ i+" = "+(num*i));
                    i++;
                }
                break;
            case 3:
                // Do-while loop
                int j=start;
                do{
                    System.out.println(num +" x "+ j+" = "+(num*j));
                    j++;
                }while(j<=end);
                break;
        }
        sc.close();
    }
}
