package TrainigChetu.Day_4;

public class UtilityClass {
    // Reverse Number

    public static int reverseNumber(int num){
        int rev=0;
        while(num>0){
            int digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        return rev;
    }
    public static int sumOfDigit(int num){
        int sum=0;
        while(num>0){
            sum+=num%10;
            num=num/10;
        }
        return sum;
    }
    public static boolean isPalindrome(int num){
     return  num==reverseNumber(num);
    }
    public static int sumOfEveDigit(int num){
        int sum=0;
        while (num>0){
            int digit=num%10;
            if (digit%2==0)
                sum=sum+digit;
            num/=10;
        }
        return sum;
    }
    public static int sumOfOddDigit(int num){
        int sum=0;
        while (num>0){
            int digit=num%10;
            if (digit%2!=0)
                sum+=digit;
            num/=10;
        }
        return sum;
    }
    public static int countDigt(int num){
        int count=0;
        while(num>0){
            int digit=num%10;
            count++;
            num/=10;
        }
        return count;
    }

    public static int LargestDigit(int num){
        int max=0;
        while (num>0){
            int digit=num%10;
            if (digit>max)
                max=digit;
            num/=10;
        }
        return max;
    }

    public static int smallestDigit(int num){
        int min=9;
        while (num>0){
            int digit=num%10;
            if (digit<min)
                min=digit;
            num/=10;
        }
        return min;
    }
    public static boolean isPrimeDigit(int num){
        if (num<2) return false;
        for (int i=2; i<num/2; i++){
            if (num%i==0) return false;
        }
        return true;
    }

    public static boolean isArmstrong(int num){
       int temp=num;
       int sum=0;
       int digits=countDigt(num);

       while (num>0){
           int digit=num%10;
           sum+=Math.pow(digit,digits);
           num/=10;

       }
       return sum==temp;
    }

}
