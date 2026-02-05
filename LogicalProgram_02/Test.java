package TrainigChetu.LogicalProgram_02;

public class Test {
    public void print(){
        for (int i=1; i<=5 ; i++){
            for (int j=1; j<=i ; j++){
                System.out.print(" * ");
            }
            System.out.println("");
        }

    }
    double print1(double a, double b){
        double sum=0.0;
        for (double i=a ; i<=b ; i+=0.5){
            sum=sum+i;
            System.out.print(i+" ");

            if(i + 0.5 <= b) {
                System.out.print(" + ");
            }
        }
        System.out.println("");
        return sum;
    }
    void print2(){
        for (int i=1; i<=3; i++){
            for (int j=1; j<=5 ; j++){
             if (j%2==1 )
                 System.out.print("#");
             else
                 System.out.print("@");
            }
            System.out.println(" ");
        }
    }

    static void main() {
        Test t=new Test();
        t.print();
        System.out.println("------------------");
       double sum= t.print1(0.5,3.0);
        System.out.println("Sum from 0.5 till 3.0==>"+sum);
        System.out.println("---------------");
        t.print2();
    }
}
