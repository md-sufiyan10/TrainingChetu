package multithreading.practice;

class MyThread extends Thread{
    @Override
    public void run(){
        for (int i=1; i<=5; i++){
            try {
                Thread.sleep(1000);
                System.out.println(i+ " ");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}

public class Task_01 {
    static void main() {
     MyThread t=new MyThread();
     t.start();
    }
}
