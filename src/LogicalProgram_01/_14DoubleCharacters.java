package practice.string_01;

import java.util.Scanner;

public class _14DoubleCharacters {
    static void main() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a String:");
        String input= scanner.nextLine();
       String doubleCharFind= doubleCharacters(input);
        System.out.println("Double Character:"+doubleCharFind);
    }
    static String doubleCharacters(String str){
        StringBuilder result=new StringBuilder();
        for (int i=0; i<str.length();i++){
           char ch=str.charAt(i);
                result.append(ch).append(ch);

            }
        return result.toString();
        }

    }

