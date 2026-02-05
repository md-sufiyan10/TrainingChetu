package TrainigChetu.LogicalProgram_01;

public class FibonacciSeries {
    public static void Fibonacci(int num){
        int a=0 ; int b=1;
        System.out.println("Fibonacci Series is:");
        for (int i=1 ; i<=num; i++){
            System.out.print(a +"  ");
            int next=a+b;
            a=b; b=next;
        }
    }
}
