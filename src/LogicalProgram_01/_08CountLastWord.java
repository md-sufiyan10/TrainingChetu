package practice.string_01;

import java.util.Scanner;

public class _08CountLastWord {

    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a String:");
        String str= scanner.nextLine();
        System.out.println("Count of Last Word: "+lengthOfLastWord(str));
    }
    static int lengthOfLastWord(String s) {
        String str = s.trim();
        int count = 0;
        for (int i = str.length()-1; i >= 0; i--) {
            if (s.charAt(i) !=' ') {
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}
