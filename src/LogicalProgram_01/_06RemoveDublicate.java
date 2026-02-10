package practice.string_01;

public class _06RemoveDublicate
{
    static void main() {
        String str="programming";
        String result="";
        for (int i=0;i<str.length();i++){
            if(!result.contains(String.valueOf(str.charAt(i)))){
                result+=str.charAt(i);
            }
        }
        IO.println(result);
    }
}
