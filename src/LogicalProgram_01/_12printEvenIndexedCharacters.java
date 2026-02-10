package practice.string_01;

import java.util.Scanner;

public class _12printEvenIndexedCharacters {
    static void main() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a String:");
        String input=scanner.nextLine();
        System.out.println("Even Indexed Characters in \""+input+"\" : ");
        printIndexCharacter(input);
    }
    static void printIndexCharacter(String str){
        for (int i=0; i<str.length();i++){
            if(i%2==0){
                System.out.print(str.charAt(i)+" ");
            }
        }
    }
}
