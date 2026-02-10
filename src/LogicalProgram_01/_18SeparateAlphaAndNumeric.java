package practice.string_01;

import java.util.Scanner;

public class _18SeparateAlphaAndNumeric {
    static void main() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a String with digit:");
        String input=scanner.nextLine();
        separateAlphaAndNumeric(input);
    }
    public static void separateAlphaAndNumeric(String str){
        StringBuilder alphapart=new StringBuilder();
        StringBuilder numericPart=new StringBuilder();

        for(char ch : str.toCharArray()){
            if (Character.isLetter(ch)){
                alphapart.append(ch);
            }else if(Character.isDigit(ch)){
                numericPart.append(ch);
            }
        }
        IO.println("Output in Alpha:"+alphapart.toString());
        IO.println("Output in Numeric:"+numericPart.toString());
    }
}
