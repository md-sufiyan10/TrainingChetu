package multithreading.deadlock;


class Resources{

    public  synchronized void Method1( Resources r){
        System.out.println(Thread.currentThread().getName()+" is calling Method1 : Lock acquired Resources 1");
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println("Error:"+e.getMessage());
        }
        r.method2(this);

    }
    public synchronized void method2(Resources r){
        System.out.println(Thread.currentThread().getName()+" is calling method2 : Lock acquired Resources 2");
    }
}

public class DeadLock_01_Problem {
    static void main() throws InterruptedException {
     Resources r1=new Resources();
     Resources r2=new Resources();

     Thread t1=new Thread(()->r1.Method1(r2), "Thread-1");
     Thread t2=new Thread(()->r2.Method1(r1), "Thread-2");
     t1.start();
     t1.join();
     t2.start();
    }
}
