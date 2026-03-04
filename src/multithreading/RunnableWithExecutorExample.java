package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableWithExecutorExample {
    public static void main(String[] args) {

        ExecutorService pool= Executors.newFixedThreadPool(2);

        Runnable task=()->System.out.println(" Running in :"+Thread.currentThread().getName());

        pool.submit(task);
        pool.submit(task);
        pool.shutdown();
    }
}
