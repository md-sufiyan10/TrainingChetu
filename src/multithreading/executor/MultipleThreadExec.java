

package multithreading.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class SleepTask implements Runnable {
    @Override
    public void run() {
        Thread currentThread = Thread.currentThread();
        System.out.println("Started Thread Name: " + currentThread.getName());
        try {
            Thread.sleep(getRandomNumber() * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Finished Thread Name: " + currentThread.getName());
    }

    private int getRandomNumber() {
        return (int) (Math.random() * 5 + 1);
    }

    public static class MultipleThreadExec {
        static void main() {
            ExecutorService service = Executors.newFixedThreadPool(3);

            for (int i = 0; i < 5; i++) {
               SleepTask task = new SleepTask();
               service.submit(task);
            }
            try {
                if (!service.awaitTermination(10, TimeUnit.SECONDS)){
                    System.out.println("Emergency Shutdown");
                    service.shutdownNow();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}