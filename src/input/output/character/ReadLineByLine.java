package input.output.character;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineByLine {
    static void main(String[] args) {

        try(BufferedReader br=new BufferedReader(new FileReader("src/input/output/character/file.txt"))){
         String line;
            System.out.println("Reading Line By Line:");
            while((line=br.readLine())!=null){
                System.out.println(line);

            }
        }catch (IOException e){
            System.out.println("Error : "+e.getMessage());
        }
    }
}
