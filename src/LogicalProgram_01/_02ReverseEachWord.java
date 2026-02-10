package practice.string_01;

public class _02ReverseEachWord {

    static void reverseEachWord(String inputString)
    {
              String[] words=  inputString.split(" ");
              String reverseString=" ";
               for (int i=0; i< words.length;i++){
                  String word=words[i];
                  String nstr=" ";
                  char ch;
                  for (int j=0; j < word.length();j++){
                      ch=word.charAt(j);
                      nstr=ch+nstr;
                  }
                  reverseString=reverseString+nstr+" ";
              }
              IO.println(inputString);
              IO.println(reverseString);
    }
    static void main() {
        reverseEachWord("Java is Good");
    }
}
