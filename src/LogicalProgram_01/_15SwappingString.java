package practice.string_01;

import java.util.Scanner;

public class _15SwappingString {
    static void main() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the First String:");
        String str1=scanner.nextLine();
        System.out.println("Enter Second String:");
        String str2=scanner.nextLine();
        System.out.println("Before Swapping : str1=>"+ str1+ " str2 =>"+str2);

        // swapping without using third variable
        str1=str1+str2;  // concatenate str1 and str2 and store in str1
        str2=str1.substring(0,str1.length()-str2.length());
        // extract the initial part (original str1) from the concatenated string

        str1=str1.substring(str2.length());
        // extract the remaning part (original str2) from the concatenating string

        System.out.println("After Swapping : str1=>"+str1+ " str2 =>"+str2);
    }
}
