package practice.string_01;

import java.util.Scanner;

public class _07CountWordsString {
    static void main() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a String:");
        String str=scanner.nextLine();
        int count=1;
        for (int i=0; i<str.length()-1;i++){
            if ((str.charAt(i)==' ' ) && (str.charAt(i+1)!= ' ')){
           count++;
            }
        }
        IO.println("Number of Words in a String:"+count);
    }
}
