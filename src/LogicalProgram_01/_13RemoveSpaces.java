package practice.string_01;

import java.util.Scanner;

public class _13RemoveSpaces {
    static void main() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a String:");
        String input=scanner.nextLine();
        String StringWithoutSpaces=removeSpaces(input);
        System.out.println("Remove White spaces:"+StringWithoutSpaces);
    }
    public static String removeSpaces(String str){
        StringBuilder result=new StringBuilder();
        for (int i=0; i<str.length();i++){
            if(str.charAt(i)!= ' '){
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }
}
