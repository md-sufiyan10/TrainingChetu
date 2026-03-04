package multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerFixProblem {
    static final AtomicInteger count=new AtomicInteger(0);

    static void main() throws InterruptedException {

        Thread a=new Thread(()->{
            for(int i=0; i<1000; i++){
                count.incrementAndGet();
            }
        });

        Thread b=new Thread(()->{
            for(int i=0; i<1000; i++){
                count.incrementAndGet();
            }
        });
        a.start();
        b.start();
        a.join();
        b.join();
        System.out.println("Count = " +count.get());
    }
}
