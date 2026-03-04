package input.output.character;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CountWords {
    static void main() {
        int wordCount=0;

        try(Scanner sc=new Scanner(new File("src/input/output/character/file.txt"))){
           while(sc.hasNext()){
                sc.next();
                wordCount++;
            }
            System.out.println("Total Words:"+wordCount);
        }catch (IOException e){
            System.out.println("Error : "+e.getMessage());
        }
    }
}
