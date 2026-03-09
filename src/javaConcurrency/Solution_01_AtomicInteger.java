package javaConcurrency;

import java.util.concurrent.atomic.AtomicInteger;

class SharedResource {
    AtomicInteger counter=new AtomicInteger();

    public void increment(){
        counter.incrementAndGet();
    }

    public int get() {
        return counter.get();
    }
}

public class Solution_01_AtomicInteger {

     static void main(String[] args) {
        SharedResource s1=new SharedResource();

        Thread t1=new Thread(()->{
            for (int i = 0; i < 200; i++)
                s1.increment();

        });

        Thread t2=new Thread(()->{
            for (int i = 0; i < 200; i++)
                s1.increment();

        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {

        }
        System.out.println(s1.get());
    }

}
