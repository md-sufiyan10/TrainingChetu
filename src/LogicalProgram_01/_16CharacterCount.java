package practice.string_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 //   aaabbccc => a3b2c3 like that

public class _16CharacterCount {
    static void main() {
       Scanner scanner=new Scanner(System.in);
       IO.println("Enter a String:");
       String input=scanner.nextLine();
       String getValuesCount= getCharacterCount(input);
       IO.println("Character Count Digit:"+getValuesCount);
    }
    public static String getCharacterCount(String str){
        HashMap<Character,Integer> charCount=new HashMap<>();

        for (char c : str.toCharArray()){
            charCount.put(c, charCount.getOrDefault(c,0)+1);
        }
        StringBuilder result=new StringBuilder();
        for (Map.Entry<Character,Integer> entry : charCount.entrySet()){
            result.append(entry.getKey()).append(entry.getValue());
        }
        return result.toString();
    }
}
