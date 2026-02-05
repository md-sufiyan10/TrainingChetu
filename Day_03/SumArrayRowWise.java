package TrainigChetu.Day_03;

public class SumArrayRowWise {
    static void main() {
        int[][] arr=UtilityArray.input2DArray();
        UtilityArray.display(arr);
        sumRowWise(arr);
    }
    public static void sumRowWise(int[][] a){
        System.out.println("Sum of the Row Wise:");
        for (int i=0; i<a.length;i++){
            int sum=0;
            for (int j=0; j<a[i].length;j++){
                sum+=a[i][j];
            }
            System.out.println("Row " + i + " sum: " + sum);
        }
        System.out.println();
    }
}
