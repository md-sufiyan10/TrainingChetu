package input.output.character;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFileUsingScanner {
    static void main() throws IOException {
        Scanner sc = new Scanner(System.in);

        try (FileWriter fw = new FileWriter("src/input/output/character/file.txt")) {
            while (true) {
                System.out.println("Enter String :(type 'exit' to stop )");
                String data=sc.nextLine();

                if(data.equalsIgnoreCase("exit")) break;
                fw.write((data+"\n"));
            }
            System.out.println("File Written Successfully");

        }catch (IOException e) {
            System.out.println("Error Occured"+e.getMessage());
        }
        sc.close();
    }
}