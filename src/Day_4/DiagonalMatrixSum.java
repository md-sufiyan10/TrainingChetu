package Day_4;

import java.util.Scanner;

public class DiagonalMatrixSum {
    static void main() {
       int[][] matrix= input2DArray();

       printArray(matrix);
        sumDiagonalMatrix(matrix);

    }
    public static int[][] input2DArray(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number of Rows:");
        int rows=scanner.nextInt();
        System.out.println("Enter Number of Columns:");
        int column=scanner.nextInt();

        int[][] arr=new int[rows][column];

        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length;j++){
                System.out.println("Enter Element ["+i+"]["+j+"]:");
                arr[i][j]=scanner.nextInt();
            }
        }
        return arr;
    }

    public static void printArray(int[][] arr){
        for (int[] num : arr) {
            for (int n : num) {
                System.out.print(n + " ");
            }
            System.out.println();
        }

    }

    public static void sumDiagonalMatrix(int[][] arr){
        int leftSum=0; int rightSum=0;
        for (int i=0 ; i<arr.length;i++){
            for (int j=0 ; j<arr[i].length;j++){
                if(i==j)
                    leftSum+=arr[i][j];
                if ((i+j)==arr[i].length-1)
                    rightSum+=arr[i][j];
            }
        }
        System.out.println("Left Diagonal Sum:"+leftSum);
        System.out.println("Right Diagonal Sum:"+rightSum);
    }
}
