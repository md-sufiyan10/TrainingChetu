package input.output.character;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileMenuProgram {
    static final String FILE_NAME="src/input/output/character/file.txt";

    // write method 1 : Write File

    static void writeFile(Scanner sc){
        try(FileWriter fw=new FileWriter(FILE_NAME)){

            while(true){
                System.out.println("Enter a String:(type 'exit' to stop):)");
                String data=sc.nextLine();
                if(data.equalsIgnoreCase("exit")) break;
                fw.write(data+"\n");

            }
            System.out.println("Data written successfully");

        }catch (IOException e){
            System.out.println("Error : "+e.getMessage());
        }
    }

    // write method 2 : Read File
    static void readFile(){
        try(BufferedReader br=new BufferedReader(new FileReader(FILE_NAME))){
            String line;
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println("Error : "+e.getMessage());
        }
    }

    // write method 3 : count words

    static void countWords(){
        int count=0;
        try(Scanner sc=new Scanner(new FileReader(FILE_NAME))){
            while(sc.hasNext()){
                sc.next();
                count++;
            }
            System.out.println("Total Words:"+count);

        }catch (IOException e){
            System.out.println("Error : "+e.getMessage());
        }
    }

    // method 4: line count

    static void lineCount(){
        int count=0;
        try(BufferedReader br=new BufferedReader(new FileReader(FILE_NAME))){
            while(br.readLine()!=null){
                count++;
            }
            System.out.println("Total Lines:"+count);
        }catch (IOException e){
            System.out.println("Error : "+e.getMessage());
        }
    }
    static void main() {
    Scanner sc=new Scanner(System.in);
      while(true){
          System.out.println("\n==== FILE MENU ====");
          System.out.println("1.Write File");
          System.out.println("2.Read File");
          System.out.println("3.Count Words");
          System.out.println("4.Line Count");
          System.out.println("5.Exit Application");
          System.out.println("Enter your choice: ");
          String input=sc.nextLine().trim();
          int choice;
          try{
              choice=Integer.parseInt(input);
          }catch (NumberFormatException e){
              System.out.println("Invalid choice. Please enter a number (1-5).");
              continue;
          }
          switch (choice){
              case 1-> writeFile(sc);
              case 2->readFile();
              case 3->countWords();
              case 4->lineCount();
              case 5->{
                  System.out.println("Exiting Application..");
                  return;
              }

              default->System.out.println("Invalid Choice");
          }


      }

    }
}
