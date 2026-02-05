package TrainigChetu.Day_03;

public class DiagonalSum {
    static void main() {
       int[][] arr= UtilityArray.input2DArray();
       UtilityArray.display(arr);
       sumDiagonalMatrix(arr);
    }
    public static void sumDiagonalMatrix(int[][] a){
        int leftSum=0;
        int rightSum=0;

        for (int i=0; i<a.length; i++){
            for (int j=0; j<a[i].length;j++){
                if (i==j)
                    leftSum+=a[i][j];
                if ((i+j)==a[i].length-1)
                    rightSum+=a[i][j];
            }
        }
        System.out.println("Sum of Left Diagonal Matrix:"+leftSum);
        System.out.println("Sum of Right Diagonal Matrix:"+rightSum);
    }
}
