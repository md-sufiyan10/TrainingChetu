package TrainigChetu.Day_6;

import java.util.Scanner;

public class ArrayMatrixOpration {
    public static void main(String[] args) {
        int[][] matrix = input2DArray();

        display(matrix);
        sumCalculation(matrix);
        sumRowWise(matrix);
        sumColumnWise(matrix);
    }

    public static int[][] input2DArray() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Row Number:");
        int row = scanner.nextInt();

        System.out.println("Enter a Column Number:");
        int column = scanner.nextInt();

        int[][] arr = new int[row][column];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Enter Element [" + i + "][" + j + "] : ");
                arr[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        return arr;
    }

    public static void display(int[][] matrix) {
        System.out.println("\n----Display Element-----");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void sumCalculation(int[][] arr) {
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                totalSum += arr[i][j];
            }
        }
        System.out.println("\nSum of All Elements: " + totalSum);
    }

    public static void sumRowWise(int[][] arr) {
        System.out.println("\nRow-wise sums:");
        for (int i = 0; i < arr.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                rowSum += arr[i][j];
            }
            System.out.println("Row " + i + " sum: " + rowSum);
        }
    }

    public static void sumColumnWise(int[][] arr) {

        System.out.println("\nColumn-wise sums:");

        int columns = arr[0].length;   // total columns

        for (int j = 0; j < columns; j++) {   // column loop
            int colSum = 0;

            for (int i = 0; i < arr.length; i++) {   // row loop
                colSum += arr[i][j];
            }

            System.out.println("Column " + j + " sum: " + colSum);
        }
    }

}