package TrainigChetu.SampleSectionB;

import java.util.Scanner;

class SuperString{
    // 1 Get input from user
    public static String getInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String str= sc.nextLine();
        sc.close();
        return str;
    }
    // 2 Count Upper Case Letters
    public static int upperCase(String str){
        int count=0;
        for (int i=0; i<str.length();i++){
            if (Character.isUpperCase(str.charAt(i)))
                count++;
        }
        return count;
    }
  // 3 count Lower Case Letters
    public static int lowerCase(String str){
        int count=0;
        for (int i=0; i<str.length();i++){
            if (Character.isLowerCase(str.charAt(i)))
                count++;
        }
        return count;
    }
// 4 . Checking String is Super
    public static boolean isSuperString(int upper, int lower){
     return upper==lower;
    }
// 5 . Display Result
    public static void displayResult(String str,  int upper, int lower, boolean isSuper)
    {
        System.out.println("========Result Checking Cases============");
        System.out.println("Input String: "+ str+ "");
        System.out.println("Upper Cases Count :"+upper);
        System.out.println("Lower Case Count :"+lower);

        if (isSuper)
            System.out.println("String is a Super String:");
        else {
            System.out.println("String is not a Super String.");
            System.out.println("Difference: "+Math.abs(upper-lower));
        }
        System.out.println("---------------");
    }
}
public class _03SuperStringChecker {
    static void main() {
        String input=SuperString.getInput();
          int uppercasecount=SuperString.upperCase(input);
          int lowercasecount= SuperString.lowerCase(input);
          boolean supercheck= SuperString.isSuperString(uppercasecount,lowercasecount);
          SuperString.displayResult(input,uppercasecount,lowercasecount,supercheck);

    }
}
