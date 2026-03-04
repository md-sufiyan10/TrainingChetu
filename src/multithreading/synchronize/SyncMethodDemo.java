package multithreading.synchronize;

class Counter{
    private int count=0;

    public synchronized void increment(){
        count++;
    }
    public int getCount(){
        return count++;
    }
}

public class SyncMethodDemo {
    static void main() throws InterruptedException {
    Counter c=new Counter();

    Thread t1=new Thread(()->{
        for(int i=0; i<1000; i++){
            c.increment();
        }
    });
    Thread t2=new Thread(()->{
        for(int i=0; i<1000; i++){
            c.getCount();
        }
    });
    t1.start();t1.join();
    t2.start();t2.join();

    System.out.println("Final Count = "+c.getCount());
    }
}
