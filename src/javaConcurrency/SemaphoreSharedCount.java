package javaConcurrency;

import java.util.concurrent.Semaphore;

public class SemaphoreSharedCount {

    public static void main(String[] args) {

        Semaphore sem=new Semaphore(1);
        new IncrementCount("A", sem);
        new DecreementCount("B", sem);
    }

}

class Shared {
    static int count = 0;
}

class IncrementCount {
    String name;
    Semaphore sem;

    public IncrementCount(String name, Semaphore sem) {

        this.name = name;
        this.sem = sem;
        new Thread(r1).start();
    }

    Runnable r1 = () -> {

        try {
            System.out.println(name + " is waiting for permit.. ");
            sem.acquire();

            System.out.println(name + " gets a Permit..");
            for (int i = 0; i < 5; i++) {
                Shared.count++;
                System.out.println(name + " : " + Shared.count);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException();
        }

        System.out.println(name + " Release the Permit..");
        sem.release();
    };
}

class DecreementCount {
    String name;
    Semaphore sem;

    public DecreementCount (String name, Semaphore sem) {
        this.name = name;
        this.sem = sem;
        new Thread(r2).start();
    }

    Runnable r2 = () -> {

        try {
            System.out.println(name + " is waiting for permit.. ");
            sem.acquire();

            System.out.println(name + " gets a Permit..");
            for (int i = 0; i < 5; i++) {
                Shared.count--;
                System.out.println(name + " : " + Shared.count);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException();
        }

        System.out.println(name + " Release the Permit..");
        sem.release();
    };
}




