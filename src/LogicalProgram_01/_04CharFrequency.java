package practice.string_01;

import java.util.HashMap;

public class _04CharFrequency {
    static void main() {
        String str="Hello";
        HashMap<Character,Integer> hashMap=new HashMap<>();
        for(char c : str.toCharArray()){
            hashMap.put(c,hashMap.getOrDefault(c,0)+1);
        }
         IO.println("Character Frequency:");
        hashMap.forEach((key, value) ->
                System.out.println( key + " → " + value)
        );
    }
}
