package input.output.character;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountLines {
    static void main() {
        int count=0;
        try(BufferedReader br=new BufferedReader(new FileReader("src/input/output/character/file.txt"))){
            while(br.readLine()!=null){
                count++;
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("Total Lines:"+count);
    }
}
