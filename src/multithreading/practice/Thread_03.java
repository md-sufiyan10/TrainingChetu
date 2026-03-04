package multithreading.practice;
public class Thread_03 {
    static void main() throws InterruptedException {
        Thread t1=new Thread(()->{
            for (int i=1; i<=5; i++){
                try {
                    Thread.sleep(500);
                    System.out.println(i);
                } catch (InterruptedException e) {
                    System.out.printf("Error : %s\n", e.getMessage());
                }

            }
        });
        Thread t2=new Thread(()->{
            for (int i=5; i<=10; i++){
                try {
                    Thread.sleep(500);
                    System.out.println(i);
                } catch (InterruptedException e) {
                    System.out.printf("Error : %s\n", e.getMessage());
                }

            }
        });
        t1.start();
        t1.join();
        System.out.println("-------------");
        t2.start();
        t2.join();
    }
}
