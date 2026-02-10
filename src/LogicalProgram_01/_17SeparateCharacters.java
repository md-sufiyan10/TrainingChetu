package practice.string_01;

import java.util.Scanner;

public class _17SeparateCharacters {
    static void main() {
        Scanner scanner=new Scanner(System.in);
        IO.println("Enter a String:");
        String input=scanner.nextLine();
        IO.println("Original String is :"+input);
        separateCharacters(input);
    }
    public static void separateCharacters(String str){
        StringBuilder lowercase=new StringBuilder();
        StringBuilder uppercase=new StringBuilder();

        for (char ch : str.toCharArray()){
            if(Character.isLowerCase(ch)){
                lowercase.append(ch);
            }else{
                uppercase.append(ch);
            }
        }
        System.out.println("Output in Lowercase:"+lowercase);
        System.out.println("Output in Uppercase:"+uppercase);
    }
}
