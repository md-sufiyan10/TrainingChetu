package multithreading.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



class Task implements Runnable{
    private int taskNumber;

    public Task(int taskNumber){
        this.taskNumber=taskNumber;
    }
    @Override
    public void run() {
        System.out.println("Task  :"+this.taskNumber+" executed By " + Thread.currentThread().getName());
    }
}

public class ThreadPoolExample {
    static void main() {

        ExecutorService pool= Executors.newFixedThreadPool(2);
    for (int i=1 ; i<=5 ; i++){
        pool.execute(new Task(i));
    }
    pool.shutdown();

    }
}
