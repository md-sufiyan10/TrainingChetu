package practice.string_01;

import java.util.Arrays;

public class _11AnagramsString {
    static boolean isAnagram(String s1, String s2){
        if (s1.length()!=s2.length()) {
            return false;
        }else{
           char ch1[]=  s1.toLowerCase().toCharArray();
           char ch2[]=s2.toLowerCase().toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);

            if (Arrays.equals(ch1,ch2)){
                return true;
            }else{
                return false;
            }
        }
    }
    static void main() {
      String s1="Keep";
      String s2="Peek";
      if (isAnagram(s1,s2)){
          IO.println(s1 +" and "+s2 +" are Anagrams");
      }else{
          IO.println(s1 +" and "+s2 +" are not a Anagrams");
      }
    }
}
