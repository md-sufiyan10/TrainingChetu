package practice.string_01;

import java.util.HashMap;
import java.util.Set;

public class _03DuplicateCharacter {

    public static void main(String[] args) {
        duplicateCharacterCount("Learn Java Programming");
    }
    static  void duplicateCharacterCount(String inputString)
    {
        HashMap<Character, Integer> charCountMap=new HashMap<>();
         char[] strArray=  inputString.toCharArray();
         for (char c : strArray){
             if(charCountMap.containsKey(c)){
                 charCountMap.put(c,charCountMap.get(c)+1);
             }else{
                 charCountMap.put(c,1);
             }
         }
        Set<Character> charString=charCountMap.keySet();
        System.out.println("Dublicate Characters in :"+inputString);

        for (Character ch: charString){
            if(charCountMap.get(ch)>1){
                System.out.println(ch + " : "+charCountMap.get(ch));
            }
        }
    }
}
