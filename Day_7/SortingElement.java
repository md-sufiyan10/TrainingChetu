package TrainigChetu.Day_7;

import java.util.Scanner;

public class SortingElement {
    static void main() {
       int[] bubbleSort= inputArray();
       sortArrayBubble(bubbleSort);
       printArray(bubbleSort);

         int[] selectionSort=bubbleSort.clone();
        selectionSort(selectionSort);
        printArray(selectionSort);
    }
    public static int[] inputArray(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Size of the Array:");
        int size=scanner.nextInt();
        int[] arr=new int[size];
        int i=0;
        while(i<size){
            System.out.println("Enter Element in Arrray " +(i+1)+":");
            arr[i]=scanner.nextInt();
            i++;
        }
        return arr;
    }

    public static void printArray(int[] a){
        System.out.println("\n Sorting Array is :");
        for (int num : a){
            System.out.print(num+" ");
        }
    }

    public static void sortArrayBubble(int[] a){

        int leng=a.length;
        for (int i=1; i<leng;i++){
            boolean swapped=false;
            for (int j=0; j<leng-i;j++){
                if (a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;

                    swapped=true;
                }
            }
            if (!swapped)break;
        }
    }

    public static void selectionSort(int[] arr){
        int length=arr.length;
        for (int i=0; i<length-1; i++){
            int minIndex=i;

            // find the minimum element in unsorted array
            for (int j=i+1 ; j<length; j++){
                if (arr[j]<arr[minIndex])
                    minIndex=j;
            }
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
    }

}
