package Day_4;

import java.util.Scanner;

public class ArrayOpreationSingleMatrix {
    static void main() {
        int[] matrix=inputArray();
            display(matrix);
       int maximum= max(matrix);
        System.out.println("Maximum is:"+maximum);
    }
    public static int[] inputArray(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Size of the Array :");
        int size=scanner.nextInt();
        int[] a=new int[size];

//        System.out.println("Enter Size of the Array 2:");
//        int m=scanner.nextInt();
//        int[] b=new int[m];

        int i=0;
        while(i<size){
            System.out.print("Enter Element in Array One By One ["+i+"] :");
            a[i]=scanner.nextInt();
            i++;
        }
        return a;
    }
    public static void display(int[] a){
        System.out.println("----Display Array here----");
        for (int i=0; i<a.length; i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println();
    }
    public static int max(int[] arr){
        int max=arr[0];
        int i=1;
        while(i<arr.length){
            if (arr[i]>max)
                max=arr[i];
            i++;
        }
        return max;
    }

}
