package multithreading.ITC;

class Inventory {

    private int stock = 0;
    private final int maxLimit;

    Inventory(int maxLimit) {
        this.maxLimit = maxLimit;
    }

    public synchronized void produce() throws InterruptedException {
        while (stock == maxLimit) {
            System.out.println(Thread.currentThread().getName() + " -> Stock full ❌ Producer waiting...");
            wait();
        }

        stock++;
        System.out.println(Thread.currentThread().getName() + " -> Produced ➕ | Current Stock: " + stock);

        notifyAll();
    }

    public synchronized void consume() throws InterruptedException {
        while (stock == 0) {
            System.out.println(Thread.currentThread().getName() + " -> Stock empty ❌ Consumer waiting...");
            wait();
        }

        stock--;
        System.out.println(Thread.currentThread().getName() + " -> Consumed ➖ | Current Stock: " + stock);

        notifyAll();
    }
}

public class ProducerConsumerDemo_02 {
    static void main(String[] args) throws InterruptedException {
        Inventory inventory = new Inventory(5);

        final int OPERATIONS = 20; // program will finish after 20 produce and 20 consume operations

        Thread producer = new Thread(() -> {
            try {
                for (int i = 0; i < OPERATIONS; i++) {
                    inventory.produce();
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Producer interrupted");
            }
        }, "PRODUCER");

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 0; i < OPERATIONS; i++) {
                    inventory.consume();
                    Thread.sleep(1500);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Consumer interrupted");
            }
        }, "CONSUMER");

        producer.start();
        consumer.start();

        producer.join();
        consumer.join();

        System.out.println("✅ Finished: producer and consumer completed " + OPERATIONS + " operations each.");
    }
}