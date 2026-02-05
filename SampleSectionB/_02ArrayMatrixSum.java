package TrainigChetu.SampleSectionB;

import java.util.Scanner;

class ArrayNorm{
    private int[][] arr=new int[4][4];

    public void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Element in 4x4 matrix i.e 16 Element ");
        for (int i=0; i<4 ; i++){
            for (int j=0; j<4 ;j++){
                arr[i][j]=sc.nextInt();
            }
        }
    }
    public double calculateNorm(){
        int sumOfSquare=0;
        for (int i=0; i<4 ; i++){
            for (int j=0; j<4 ; j++){
                sumOfSquare+=arr[i][j]* arr[i][j];
                //sumOfSquare=sumOfSquare+(arr[i][j]* arr[i][j]);
            }
        }
        System.out.println("Sum of Square of Elements = "+sumOfSquare);
        return Math.sqrt(sumOfSquare);
    }
    // display to NORM

    public void displayNorm(double norm){
        System.out.println("NORM is:"+norm);
    }
}
public class _02ArrayMatrixSum {
    static void main() {
        ArrayNorm obj=new ArrayNorm();
        obj.accept();
        double norm=obj.calculateNorm();
        obj.displayNorm(norm);
    }
}
