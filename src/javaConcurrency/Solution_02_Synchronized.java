package javaConcurrency;
class ShareResource {
    int counter;

    public synchronized void increment(){
        counter++;
    }
    public int get(){
        return counter;
    }
}
public class Solution_02_Synchronized {
    static void main() throws InterruptedException {
        ShareResource s2=new ShareResource();
      Thread t1=  new Thread(()->{
            for(int i=0;i<3000;i++){
                s2.increment();
            }
        });
      Thread t2=  new Thread(()->{
            for (int i=0;i<3000;i++){
                s2.increment();
            }
        });
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println(s2.get());
    }
}
