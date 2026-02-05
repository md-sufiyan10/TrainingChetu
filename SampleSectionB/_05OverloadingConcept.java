package TrainigChetu.SampleSectionB;

class OverLoading{
    public void print(){
        for (int i=1; i<=3; i++){
            for (int j=1; j<=5 ; j++){
                if (j%2==0)
                    System.out.print("#");
                else
                    System.out.print("@");
            }
            System.out.println("");
        }
    }
    public double print(double start, double end){
        System.out.println("\nCalculating sum from " + start + " to " + end + " with step 0.5");
        double sum=0.0;
        for ( double num=start ; num<=end ; num+=0.5){
            sum+=num;
            System.out.print(num);
            if (num+ 0.5 <= end)
                System.out.print(" + ");
        }
        return sum;
    }

    public void print(char first, char second){
        System.out.println("\nComparing characters: '" + first + "' and '" + second + "'");

        int asciFirst= (int)first;
        int asciSecond=(int)second;

        System.out.println("ASCII of " +first+ " ' = "  + asciFirst);
        System.out.println("ASCII of "  +second+ " ' = "  + asciSecond);




    }
}
public class _05OverloadingConcept {
    static void main() {
        OverLoading ov=new OverLoading();
        ov.print();
        double sum= ov.print(1.0 , 3.0);
        System.out.println("\n Total Sum = "+sum);

    }
}
