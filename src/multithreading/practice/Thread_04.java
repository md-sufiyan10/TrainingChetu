package multithreading.practice;

public class Thread_04 {
    static void main() {
        Thread threadA=new Thread(()->{
            for (int i=1; i<=5; i++){
                System.out.println("A : "+i);
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    System.out.println("Thread A interrupted");
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        });
        Thread threadB=new Thread(()->{
            for (int i=6; i<=10; i++){
                System.out.println("B : "+i);
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    System.out.println("Thread B interrupted");
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        });
        threadA.start();
        try{
            threadA.join();  //wait until threadA is finished
            System.out.println("--------------");
        }catch (InterruptedException e){
            System.out.println("Main thread interrupted");
            Thread.currentThread().interrupt();
            return;
        }
        threadB.start();
        try{
            threadB.join();

        }catch (InterruptedException e){
            System.out.println("Main thread interrupted");
            Thread.currentThread().interrupt();
            return;
        }
        System.out.println("Main thread finished");
    }
}
