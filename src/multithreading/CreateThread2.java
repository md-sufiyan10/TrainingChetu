package multithreading;

public class CreateThread2 {
    static void main() throws InterruptedException {
//        Task task = new Task();
//    Runnable task = new Runnable(){
//        public void run(){
//            for(int i=1; i<=5; i++){
//                System.out.println("Runnable-worker:"+i);
//            }
//
//        }
//    };

        Runnable task = ()->{
            for(int i=1; i<=5; i++){
                System.out.println("Lambda-worker:"+i);
            }
        };
        Thread t = new Thread(task);
        t.start();
        t.join();
        System.out.println("Main thread");
    }
}
//     class Task implements Runnable{
//        public void run(){
//            for(int i=1; i<=5; i++){
//                System.out.println("Runnable-worker:"+i);
//            }
//
//        }


