package TrainigChetu.LogicalProgram_02;

import java.util.Scanner;

public class _07MarksGrade {
    static void main() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Marks:");
        double marks=scanner.nextDouble();

        if (marks >= 90)
            System.out.println("Grade A :");
        else if( marks > 80 && marks <90)
            System.out.println("Grade B :");
        else if(marks > 60 && marks <80)
            System.out.println("Grade D:");
        else
            System.out.println("Fail Sorry Try Next Time:");
    }
}
