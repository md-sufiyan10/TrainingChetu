package javaConcurrency;

class SharedResources {
    int counter;

    public void increment() {
        counter++;
    }

    public int get() {
        return counter;
    }
}

public class ConcurrencyProblem {

    public static void main(String[] args) {

        SharedResources sr = new SharedResources();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 2000; i++)
                sr.increment();

        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 2000; i++)
                sr.increment();

        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {

        }
        System.out.println(sr.get());

    }

}
