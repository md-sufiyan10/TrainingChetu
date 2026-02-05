package TrainigChetu.Day_03;

import java.util.Scanner;

public class UtilityArray {
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
}
