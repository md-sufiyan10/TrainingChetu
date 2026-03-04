package assignmentCollection.LinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class QueueUsing_LinkedList {
    static void main() {

        Queue<Integer> bankQueue = new LinkedList<>();

        // TASKS: Implement Bank Queue
        // a) 10 customers enqueue
        enqueueCustomers(bankQueue, 10);

        // b) 3 customers dequeue (serve)
        serveCustomers(bankQueue, 3);


        // c) Print remaining queue
        System.out.println("Remaining Queue: " + bankQueue);

        // d) Check if empty
        System.out.println(bankQueue.isEmpty() ? "Queue is empty" : "Queue is not empty");


        // e) Peek next customer
        Integer nextCustomer = bankQueue.peek(); // safe: returns null if empty
        if (nextCustomer == null) {
            System.out.println("Next Customer: None (queue is empty)");
        } else {
            System.out.println("Next Customer: " + nextCustomer);
        }
    }

       private static void enqueueCustomers(Queue<Integer> queue, int totalCustomers) {
            for (int customerId = 1; customerId<= totalCustomers; customerId++) {
                queue.offer(customerId);
            }
           System.out.println("Enqueued Customers: " + totalCustomers+" customers:"+queue);
        }

       private static void serveCustomers(Queue<Integer> queue, int customersToServe) {
           System.out.println("Served Customers: " + customersToServe + " customers:");
            for (int i = 0; i < customersToServe; i++) {
               Integer served= queue.poll(); // dequeue safely
              if(served==null) System.out.println("No More Customer served: None (queue is empty)");
              else System.out.println("Customer served: "+served);
            }
           System.out.println("Queue after serving: " + queue);

       }


    }

