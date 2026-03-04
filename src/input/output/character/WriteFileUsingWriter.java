package input.output.character;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFileUsingWriter {
    static void main() {
        try{
            // open file for writing
            FileWriter fw=new FileWriter("D:\\Coding projects\\TrainigChetu\\src\\input\\output\\character\\file.txt");
            String data="Hello World!";
            fw.write(data);  // write data to file
            fw.close();
            System.out.println("Data written successfully");
        }catch (IOException e){
            System.out.println("Error : "+e.getMessage());
        }
    }
}
