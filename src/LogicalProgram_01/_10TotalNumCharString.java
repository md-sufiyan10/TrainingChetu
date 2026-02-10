package practice.string_01;

import java.util.Scanner;

public class _10TotalNumCharString {
    static void main() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a String:");
        String str=scanner.nextLine();
        int count=0;
        for (int i=0; i<str.length();i++){
            if (str.charAt(i)!=' '){
                count++;
            }
        }
        System.out.println("Number of Characters in a String are :"+count);
    }
}
