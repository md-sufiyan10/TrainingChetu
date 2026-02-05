package Day_03;

import java.util.Scanner;

public class MatrixSum {
    static void main() {
       int[][] matrix= inputArray2D();

       displayArray(matrix);
        sumMatrix(matrix);

    }
    public static int[][] inputArray2D(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Number of Rows:");
        int r=scanner.nextInt();
        System.out.println("Enter Number of column:");
        int c=scanner.nextInt();

        int[][] size=new int[r][c];
        for (int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                System.out.println("Enter Element ["+i+"]["+j+"]: ");
                size[i][j]=scanner.nextInt();
            }
        }
        return size;
    }
    public static void sumMatrix(int[][] a){
        int sum=0;
        for (int i=0; i<a.length; i++){
            for (int j=0; j<a[i].length;j++){
                sum+=a[i][j];
            }
        }
        System.out.println("Sum Matrix is:"+sum);
    }
    public static void displayArray(int[][] a){
        System.out.println("\n----Display Element-----");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
