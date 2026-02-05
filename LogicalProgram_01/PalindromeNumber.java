package TrainigChetu.LogicalProgram_01;

public class PalindromeNumber {

    public static boolean isPalindrome(int num){
        return num==reverse(num);
    }
    public static int reverse(int num){
        int rev=0;
        while(num>0){
            int digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        return rev;
    }
}
