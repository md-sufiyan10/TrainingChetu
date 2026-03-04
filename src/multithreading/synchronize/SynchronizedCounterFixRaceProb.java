package multithreading.synchronize;

public class SynchronizedCounterFixRaceProb {
    static int count=0;
    static final Object lock=new Object();

    static void main() throws InterruptedException {
        Thread a=new Thread(()->{
            for(int i=0; i<1000; i++){
                synchronized (lock){
                    count++;
                }
            }
        });
        Thread b=new Thread(()->{
            for(int i=0; i<1000; i++){
                synchronized (lock){}
            }
        });
        a.start();
        b.start();
        a.join();
        b.join();
        System.out.println("Count : "+count);
    }
}
