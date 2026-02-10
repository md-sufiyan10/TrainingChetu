package TrainigChetu.src.assignmentPDFQeus;

// ArrayMagnitudeDemo.java
import java.util.Scanner;

class ArrayMagnitude {
    private final int[][] a = new int[4][4];
    private double magnitude;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 16 integer values for 4x4 array:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("a[" + i + "][" + j + "] = ");
                a[i][j] = sc.nextInt();
            }
        }
    }

    void calculateMagnitude() {
        int sumSquares = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sumSquares += a[i][j] * a[i][j];
            }
        }

        magnitude = Math.sqrt(sumSquares);
    }

    void display() {
        System.out.println("\nArray is:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nMagnitude (Norm) = " + magnitude);
    }
}

public class ArrayMagnitudeDemo {
    public static void main(String[] args) {
        ArrayMagnitude obj = new ArrayMagnitude();
        obj.accept();
        obj.calculateMagnitude();
        obj.display();
    }
}
