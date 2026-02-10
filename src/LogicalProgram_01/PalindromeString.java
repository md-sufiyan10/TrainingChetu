package TrainigChetu.src.LogicalProgram_01;

import java.util.Scanner;

public class PalindromeString {

    static boolean isPalindrome(String str){
        int start=0;
        int end=str.length()-1;
        while(start<end){
            if (str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++; end--;
        }
        return true;
    }

    static void main() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a String:");
        String str=scanner.nextLine();
       IO.println(isPalindrome(str));
    }
}
