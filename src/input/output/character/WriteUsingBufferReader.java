package input.output.character;

import java.io.*;

public class WriteUsingBufferReader {
    static void main() throws FileNotFoundException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        try(FileWriter fw=new FileWriter("src/input/output/character/file.txt")){
            while(true){
                System.out.println("Enter String :(type 'exit' to stop )");
                String data=br.readLine();
                if(data.equalsIgnoreCase("exit")) break;
                //fw.write(data+"\n");
                fw.write(data+ System.lineSeparator());
            }
            System.out.println("File Written Successfully");

        }catch (IOException e){
            System.out.println("Error : "+e.getMessage());
        }
    }
}
