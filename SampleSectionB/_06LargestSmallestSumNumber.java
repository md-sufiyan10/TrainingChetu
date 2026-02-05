package TrainigChetu.SampleSectionB;

import java.util.Scanner;

class DigitChecking{

    int num;
    void accept(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Number:");
        num=scanner.nextInt();
    }
    int LargestDigit(){
      int temp=num;
      int largest=0;
      while(temp>0){
          int digit=temp%10;

          if (digit > largest) {
              largest = digit;
          }
          temp = temp / 10;
      }
      return largest;
    }
    int SmallestDigit(){
        int temp=num;
        int smallest =9;
        while(temp>0){
            int digit=temp%10;
            if (digit< smallest) {
                smallest = digit;
            }
            temp = temp / 10;
        }
        return smallest;
    }
    void checkingSum(int sum){
        if (sum % 2 == 0)
            System.out.println("Sum is Even Number: "+sum);
        else
            System.out.println("Sum is Odd: "+ sum);
    }
}
public class _06LargestSmallestSumNumber {
    static void main() {
      DigitChecking obj=new DigitChecking();
      obj.accept();
       int largest= obj.LargestDigit();
       int smallest=obj.SmallestDigit();

        System.out.println("Largest Number is:"+largest);
        System.out.println("Smallest Number is:"+smallest);

           int sum=largest+smallest;
           obj.checkingSum(sum);
    }
}
