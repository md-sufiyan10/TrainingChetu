package assignmentCollection.LinkedList;

import java.util.LinkedList;

public class BrowserHistory {
    static void main() {
        LinkedList<String> history = new LinkedList<>();

        // TASKS: Simulate browser back/forward
        // a) Add 5 websites
        history.add("Website1");
        history.add("Website2");
        history.add("Website3");
        history.add("Website4");
        history.add("Website5");
        System.out.println("History: " + history);
        // b) Go back 2 pages
        history.removeLast();
        history.removeLast();

        System.out.println("History after back 2 pages: " + history);


        // c) Add new page (clear forward history)
        history.add("Website6");
        System.out.println("History after add new page: " + history);

        // d) Go forward 1 page
        history.removeFirst();
        System.out.println("History after forward 1 page: " + history);

        // e) Print current position
        System.out.println("Current Position: " + history.getFirst());
    }
}
