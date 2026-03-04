package multithreading.synchronize;


class Printer{
    public void printTable(int n){
        synchronized (this){
            for(int i=1;i<=10;i++){
                System.out.println( n +" x " +i + "="+(n*i) +" ");
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}

public class SyncBlockDemo {
    static void main() throws InterruptedException {
        Printer p=new Printer();
        Thread t1=new Thread(()-> p.printTable(2));

        Thread t2=new Thread(()-> p.printTable(3));
        t1.start();
        t1.join();
        System.out.println("-----------");
        t2.start();
    }
}
