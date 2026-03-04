package multithreading;

public class RaceConditionDemo {
    static int count=0;

    static void main() throws InterruptedException {

        Thread a=new Thread(()->{
            for(int i=0; i<1000; i++){
                count++;
            }
        });
//        Runnable b=new Thread(()->{
//            for (int i=0; i<1000; i++){
//                count++;
//            }
//        });
//        Thread c=new Thread(b);
        Thread b=new Thread(()->{
            for (int i=0; i<1000; i++){
                count++;
            }
        });

        a.start();
        b.start();
//        a.join();
//        b.join();
        System.out.println("Count : "+count);
    }
}
