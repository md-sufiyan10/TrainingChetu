package TrainigChetu.src.assignmentPDFQeus;

// BalancedCaseStringDemo.java
import java.util.Scanner;

class BalancedCaseString {
    private String str;
    private int upperCount;
    private int lowerCount;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        str = sc.nextLine();
    }

    void checkBalanced() {
        upperCount = 0;
        lowerCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                upperCount++;
            } else if (Character.isLowerCase(ch)) {
                lowerCount++;
            }
            // other characters (digits, spaces, symbols) are ignored
        }
    }

    void display() {
        System.out.println("\nUppercase letters = " + upperCount);
        System.out.println("Lowercase letters = " + lowerCount);

        if (upperCount == lowerCount) {
            System.out.println("Result: Balanced-Case String");
        } else {
            System.out.println("Result: Not a Balanced-Case String");
        }
    }
}

public class BalancedCaseStringDemo {
    public static void main(String[] args) {
        BalancedCaseString obj = new BalancedCaseString();
        obj.accept();
        obj.checkBalanced();
        obj.display();
    }
}