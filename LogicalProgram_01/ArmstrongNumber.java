package TrainigChetu.LogicalProgram_01;

public class ArmstrongNumber {
    // Sirf logic method
    public static boolean isArmstrong(int num) {
        int noOfDigits = countDigits(num);
        int temp = num;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += power(digit, noOfDigits);
            temp /= 10;
        }
        return sum == num;
    }

    private static int power(int base, int exp) {
        int result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        return result;
    }

    private static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }
}
