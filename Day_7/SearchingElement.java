package TrainigChetu.Day_7;

import TrainigChetu.SampleSectionB.BinarySearch;

import java.util.Scanner;

public class SearchingElement {
    static void main() {
        Scanner scanner=new Scanner(System.in);
        int[] array = inputArray(scanner);
        System.out.println("Choose Search Method:");
        System.out.println("1 . Linear Search:");
        System.out.println("2 . Binary Search:");

        int choice =scanner.nextInt();
        System.out.println("Enter the Element to Search:");
        int element =scanner.nextInt();

        switch (choice){
            case 1->LinearSearch(array,element);
            case 2-> BinarySearch(array,element);
            default -> System.out.println("Invalid Choice:");
        }



    }
    public static  int[] inputArray(Scanner scanner){

        System.out.println("Enter the Array Size:");
        int size=scanner.nextInt();
        int[] nums=new int[size];
        int i=0;
        while(i<size){
            System.out.println("Please enter Element no "+(i+1)+": ");
            nums[i]=scanner.nextInt();
            i++;

        }
        return nums;
    }
    public static void LinearSearch(int[] arr, int element){
        System.out.println("Find the Searching Element:");

        boolean found=false;
        for (int i=0; i<arr.length;i++){
            if (arr[i]==element){
                System.out.println("Element Found at Index: "+i);
                found=true;
                break;
            }
        }
        if (!found)
            System.out.println("Element not Found:");
    }
    public static void BinarySearch(int [] arr, int element){
        int left=0;
        int right=arr.length-1;
        boolean found=false;

        while (left<=right){
            int mid=(left+right)/2;
            if (arr[mid]==element){
                System.out.println(element +" => Element is found at index:"+mid);
                found=true;
                break;
            }
            if (element > arr[mid])
                left=mid+1;
            else
                right=mid-1;
        }
        if (!found)
            System.out.println("Element is Not found:");
    }
}
