package practice.string_01;

import java.util.Scanner;

public class _09ReverseWord {
    static String reverseWords(String s) {
        String words[] = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
    public static void main(String[] args) {   // ✅ FIXED
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String :");
        String str=scanner.nextLine();
        IO.println("Reverse String Each Word: "+reverseWords(str));
    }
}

