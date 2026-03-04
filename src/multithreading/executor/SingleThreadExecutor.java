package multithreading.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintNumber implements Runnable{
    @Override
    public void run() {
        for (int i=0; i<10; i++){
            System.out.printf("Number is %d\n", i+1);
        }
    }
}
public class SingleThreadExecutor {
    static void main() {
        ExecutorService service= Executors.newSingleThreadExecutor();
//         service.execute(new PrintNumber());
//         service.shutdown();

        PrintNumber pn=new PrintNumber();
        service.submit(pn);


    }
}
