package TrainigChetu.LogicalProgram_02;

import java.util.Scanner;

public class _05CircleArea {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Circle Radious:");
        //int r=sc.nextInt();
       //  double area=3.14*r*r;
        double r=sc.nextDouble();
        double area=Math.PI*r*r;
        System.out.println("Area of the Circle is :"+area);
    }
}
