package Day_03;

public class SumArrayColumnWise {
    static void main() {
       int[][] arr= UtilityArray.input2DArray();
       UtilityArray.display(arr);
       // sumColumnWise(arr);
        sumArrayColumn(arr);
    }
    public static void sumArrayColumn(int[][] a){
        System.out.println("Sum of the Array Column Wise:");
        int column=a[0].length; // total column
        for (int j=0; j<column; j++){  // column loop
            int columnSum=0;
            for (int i=0 ; i<a.length;i++){ // row loop
                columnSum+=a[i][j];
            }
            System.out.println("Column "+j+ " sum "+columnSum);
        }
        System.out.println();
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
