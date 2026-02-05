package TrainigChetu.Day_6;

import java.util.Scanner;

public class DiagonalMatrixSum {
    static void main() {
        int[][] matrix=input2DArray();
        printArray(matrix);
        sumDiagonal(matrix);

    }
    public static  int[][] input2DArray(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Number of Rows:");
        int rows=scanner.nextInt();
        System.out.println("Enter Number of Columns:");
        int column=scanner.nextInt();

        int [][] arr=new int[rows][column];

        for (int i=0; i<rows; i++){
            for (int j=0; j<arr[i].length;j++){
                System.out.println("Enter Element in Array +["+i+"]["+j+"]:");
                arr[i][j]=scanner.nextInt();
            }
        }
        return arr;
    }
    public static void printArray(int[][] array){
        System.out.println("======Display Matrix======");
        for (int i=0; i<array.length;i++){
            for (int j=0; j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static  void sumDiagonal(int[][] arr){
        int leftDiaSum=0;
        int rightDiaSum=0;
        for (int i=0; i<arr.length;i++){
            for (int j=0; j<arr[i].length;j++){
                if (i==j)     // Left diagonal
                    leftDiaSum= leftDiaSum+arr[i][j];
                if(i+j==arr[i].length-1)
                    rightDiaSum+=arr[i][j];
            }
        }
        System.out.println("LeftDiagonal Sum:"+leftDiaSum);
        System.out.println("Right Diagonal Sum:"+rightDiaSum);
    }
}
