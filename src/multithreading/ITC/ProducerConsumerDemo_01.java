package multithreading.ITC;

class Shared {

    private int data;
    private boolean available = false;

    public synchronized void produce(int value) throws InterruptedException {

        while (available)
            wait();

        data = value;
        System.out.println("Produced: " + value);

        available = true;
        notify();
    }

    public synchronized void consume() throws InterruptedException {

        while (!available)
            wait();

        System.out.println("Consumed: " + data);

        available = false;
        notify();
    }
}

public class ProducerConsumerDemo_01 {

     static void main(String[] args) {

        Shared shared = new Shared();

        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                try { shared.produce(i); }
                catch (InterruptedException _) {}
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                try { shared.consume(); }
                catch (InterruptedException _) {}
            }
        });

        producer.start();
        consumer.start();
    }
}
