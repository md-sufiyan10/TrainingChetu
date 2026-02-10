package practice.string_01;

import java.util.Scanner;

public class _05PalindromeCheck {
    static void main() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = scanner.nextLine();
         String rev="";
        for(int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        if (str.equals(rev)){
             IO.println("Palindrome String:"+str);
         }else{
             IO.println("Not Palindrome String:"+str);
         }
    }

}
