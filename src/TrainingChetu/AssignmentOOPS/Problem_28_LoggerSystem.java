package TrainigChetu.AssignmentOOPS;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

abstract class Logger{
    abstract void log(String msg);
}
class ConsoleLogger extends Logger{
    @Override
    void log(String msg) {
        System.out.println("[CONSOLE] "+msg);
    }
}
class FileLogger extends Logger{
    private final Path filePath;

    FileLogger(String fileName) {
        this.filePath = Path.of(fileName);
    }
    @Override
    void log(String msg) {
      String line = "[FILE] "+msg + System.lineSeparator();
      try{
        Files.writeString(
                filePath,
                line,
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND);
      }catch (IOException e){
          System.out.println("Error in writing to file: "+e.getMessage());
      }
    }
}
public class Problem_28_LoggerSystem {
    static void main() {
    Logger l1=new ConsoleLogger();
    Logger l2=new FileLogger("log.txt");

    l1.log("Application Started...");
    l2.log("Application log2 Started...");
    l1.log("User Loged in...");
    l2.log("User Loged log2 in...");

    //ouput [CONSOLE] Application Started...
        //[CONSOLE] User Loged in...
    }
}
