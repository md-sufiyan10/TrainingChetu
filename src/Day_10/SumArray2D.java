package Day_10;

import java.util.Scanner;

public class SumArray2D {
    static void main() {

    }


    public static int[][] inputArray2D(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Number of Row:");
        int row=scanner.nextInt();

        System.out.println("Enter a Number of Column:");
        int col=scanner.nextInt();

        int[][] arr=new int[row][col];

        for (int i=0 ; i<arr.length;i++){
            for (int j=0; j<arr[i].length;j++){
                System.out.println("Enter Element One by One in Array ["+i+"]["+j+"]:");
                arr[i][j]=scanner.nextInt();
            }
        }
        return arr;
    }



}
