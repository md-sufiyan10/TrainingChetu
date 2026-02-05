package TrainigChetu.SampleSectionB;

import java.util.Scanner;
import java.util.Arrays;

class _04BinarySearchCharacter {

    private char[] arr = {'A','H','N','P','S','U','W','Y','Z','b','d'};

    // Method to perform binary search
    public boolean binarySearch(char key) {

        // Step 1: Sort the array
        Arrays.sort(arr);

        int low = 0;
        int high = arr.length - 1;

        // Step 2: Binary Search Logic
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key)
                return true;
            else if (key < arr[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return false;
    }

    // Method to display result
    public void displayResult(boolean found) {
        if (found)
            System.out.println( "Search Successful");
        else
            System.out.println("Search is not Successful");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        _04BinarySearchCharacter obj = new _04BinarySearchCharacter();

        System.out.print("Enter character to search: ");
        char ch = sc.next().charAt(0);

        boolean result = obj.binarySearch(ch);
        obj.displayResult(result);
    }
}
