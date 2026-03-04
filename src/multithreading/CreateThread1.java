package multithreading;


class MyThread extends Thread{
    public void run(){
        for(int i=1; i<=3; i++){
            System.out.println("Worker: " +i);
        }
    }
}

public class CreateThread1 {
    static void main(String[] args) throws InterruptedException {

        Thread t = new MyThread();
        t.start();

        for(int i=1; i<=3; i++){
            System.out.println("Main: " +i );
        }
        t.join(); // wait for t finish
        System.out.println("Main: Done");
    }
}
