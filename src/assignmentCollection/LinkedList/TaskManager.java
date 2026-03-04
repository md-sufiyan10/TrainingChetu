package assignmentCollection.LinkedList;

import java.util.LinkedList;

public class TaskManager {
    static void main() {
        LinkedList<String> tasks = new LinkedList<>();

        // a) Add 5 pending tasks
        tasks.add("Task 1");
        tasks.add("Task 2");
        tasks.add("Task 3");
        tasks.add("Task 4");
        tasks.add("Task 5");
        System.out.println("Tasks: " + tasks);
        // b) Complete first 2 tasks (removeFirst)
        tasks.removeFirst();
        tasks.removeFirst();
        System.out.println("Tasks after completing first 2: " + tasks);

        // c) Add urgent task at front
        tasks.addFirst("Urgent Task");
        System.out.println("Tasks after adding urgent task: " + tasks);

        // d) Print remaining tasks
        System.out.println("Printing remaining tasks:");
        for(String task : tasks){
            System.out.println(task);
        }
        System.out.println("Remaining Tasks: " + tasks);

        // e) Clear all completed tasks
        tasks.clear();
        System.out.println("Tasks after clearing completed tasks: " + tasks);
    }
}
