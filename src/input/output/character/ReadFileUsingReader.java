package input.output.character;

import java.io.FileReader;
import java.io.IOException;

public class ReadFileUsingReader {
    static void main() {

        try{
            // open file for reading
            FileReader fr=new FileReader("D:\\Coding projects\\TrainigChetu\\src\\input\\output\\character\\file.txt");
            int i;
            System.out.println("Reading data from file using FileReader...");
            while ((i=fr.read())!=-1){
                System.out.print((char)i);  // read character by character
            }
            fr.close();
        }catch (IOException e){
            System.out.println("Error in reading file:"+e.getMessage());
        }
    }
}
