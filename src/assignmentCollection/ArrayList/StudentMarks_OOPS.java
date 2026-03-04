package assignmentCollection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class StudentMarksApp{
    private final List<Integer> marks;

    public StudentMarksApp() {
        this.marks = new ArrayList<>();
    }

    public void addMark(int mark) {
        marks.add(mark);
    }

    // a) total and average
    public int getTotal() {
        int total = 0;
        for (int m : marks) {
            total += m;
        }
        return total;
    }

    public double getAverage() {
        if (marks.isEmpty()) return 0;
        return (double) getTotal() / marks.size();
    }

    // b) highest & lowest with index
    public int getHighestIndex() {
        if (marks.isEmpty()) return -1;

        int highestIndex = 0;
        for (int i = 1; i < marks.size(); i++) {
            if (marks.get(i) > marks.get(highestIndex)) {
                highestIndex = i;
            }
        }
        return highestIndex;
    }

    public int getLowestIndex() {
        if (marks.isEmpty()) return -1;

        int lowestIndex = 0;
        for (int i = 1; i < marks.size(); i++) {
            if (marks.get(i) < marks.get(lowestIndex)) {
                lowestIndex = i;
            }
        }
        return lowestIndex;
    }

    public int getHighestMark() {
        int index = getHighestIndex();
        return (index == -1) ? -1 : marks.get(index);
    }

    public int getLowestMark() {
        int index = getLowestIndex();
        return (index == -1) ? -1 : marks.get(index);
    }

    // c) remove marks < given threshold
    public void removeMarksLessThan(int threshold) {
        marks.removeIf(m -> m < threshold);
    }

    // d) add at end
    public void addAtEnd(int mark) {
        marks.add(mark);
    }

    // e) sort ascending
    public void sortAscending() {
        Collections.sort(marks);
    }

    public void printMarks() {
        System.out.println(marks);
    }

    public int size() {
        return marks.size();
    }
}

public class StudentMarks_OOPS{
    public static void main(String[] args) {

        StudentMarksApp sm = new StudentMarksApp();
        sm.addMark(85);
        sm.addMark(92);
        sm.addMark(78);
        sm.addMark(95);

        // a)
        System.out.println("a) Total = " + sm.getTotal() + ", Average = " + sm.getAverage());

        // b)
        System.out.println("b) Highest = " + sm.getHighestMark() + " at index " + sm.getHighestIndex());
        System.out.println("   Lowest  = " + sm.getLowestMark() + " at index " + sm.getLowestIndex());

        // c)
        sm.removeMarksLessThan(80);
        System.out.print("c) After removing < 80: ");
        sm.printMarks();

        // d)
        sm.addAtEnd(88);
        System.out.print("d) After adding 88: ");
        sm.printMarks();

        // e)
        sm.sortAscending();
        System.out.print("e) Sorted ascending: ");
        sm.printMarks();
    }
}

