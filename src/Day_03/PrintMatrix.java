package Day_03;

import java.util.Scanner;

import java.util.Scanner;

public class PrintMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows:");
        int r = sc.nextInt();
        System.out.println("Enter Column:");
        int c = sc.nextInt();

        int[][] a = new int[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.println("Enter Element ["+i+"]["+j+"]: ");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Print Array:");
       for (int i=0; i<a.length;i++){
           for (int j=0; j<a[i].length;j++){
               System.out.print(a[i][j]+" ");
           }
       }
        System.out.println();
    }
}
