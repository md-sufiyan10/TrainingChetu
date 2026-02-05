package TrainigChetu.Day_5;

import java.util.Scanner;

public class _08MultiplicationTable {
    static void main() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Number :");
        int t=scanner.nextInt();

//        for (int i = 1; i <= 10; i++) {
//            System.out.println(t + " x " + i + " = " + (t * i));
//        }

//        int i=1;
//        while(i<=10){
//            System.out.println(t+" x "+ i+ " = "+(t*i));
//            i++;
//        }

        int i=1;
        do{
            System.out.println(t +" x "+i+ " = "+(t*i));
            i++;
        }while(i<=10);

    }
}
