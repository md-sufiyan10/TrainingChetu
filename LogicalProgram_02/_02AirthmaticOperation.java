package TrainigChetu.LogicalProgram_02;

import java.util.Scanner;

public class _02AirthmaticOperation {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Number:");
        int n1=sc.nextInt();
        System.out.println("Enter second Number:");
        int n2=sc.nextInt();
        addtition(n1, n2);
        subtraction(n1,n2);
        multiplication(n1,n2);
        division(n1,n2);
        modulus(n1,n2);

    }

    static void addtition(int x, int y){
        System.out.println("Addition two Number:"+(x+y));
    }
    static void subtraction(int x, int y){
        System.out.println("Subtracion two Number:"+(x-y));
    }
    static void multiplication(int x, int y){
        System.out.println("Multiplication two Number:"+(x*y));
    }
    static void division(int x, int y){
        System.out.println("Division two Number:"+(x/y));
    }
    static void modulus(int x, int y){
        System.out.println("Modulus two Number:"+(x%y));
    }

}
