package multithreading.practice;

class MyThread1 implements Runnable{
    @Override
    public void run() {
        for (int i=1; i<=5; i++){
            System.out.println("Hello");
        }
    }
}
public class Task_02 {
    static void main() {
      MyThread1 mt=new MyThread1();
      Thread t1=new Thread(mt);
      t1.start();
      Runnable t=new Thread(()-> {
          for (int i=1; i<=5; i++) {
              try {
                  Thread.sleep(1000);
                  System.out.println("world");
              } catch (InterruptedException e) {
                  throw new RuntimeException(e);
              }
          }
      });
      new Thread(t).start();
    }
}
