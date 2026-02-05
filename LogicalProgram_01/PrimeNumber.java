package TrainigChetu.LogicalProgram_01;

public class PrimeNumber {
    public static boolean isPrimeNumber(int num){
        if (num<=1) return false;
        for (int i=2; i<=num/2 ; i++){
            if (num%2==0) return false;
        }
        return true;
    }
}
