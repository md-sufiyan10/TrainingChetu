package assignmentCollection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class StudentMarksNormal{
     static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(85);
        marks.add(92);
        marks.add(78);
        marks.add(95);

        // a) Find total marks and average
        int total = 0;
        for (int m : marks) {
            total += m;
        }
        double average = (marks.isEmpty()) ? 0 : (double) total / marks.size();
        System.out.println("a) Total = " + total + ", Average = " + average);

        // b) Find highest and lowest marks with index
        int highest = marks.get(0);
        int lowest = marks.get(0);
        int highestIndex = 0;
        int lowestIndex = 0;

        for (int i = 1; i < marks.size(); i++) {
            int current = marks.get(i);

            if (current > highest) {
                highest = current;
                highestIndex = i;
            }
            if (current < lowest) {
                lowest = current;
                lowestIndex = i;
            }
        }

        System.out.println("b) Highest = " + highest + " at index " + highestIndex);
        System.out.println("   Lowest  = " + lowest + " at index " + lowestIndex);

        // c) Remove marks < 80
        marks.removeIf(m -> m < 80);
        System.out.println("c) After removing < 80: " + marks);

        // d) Add 88 at the end
        marks.add(88);
        System.out.println("d) After adding 88: " + marks);

        // e) Print sorted marks (ascending)
        Collections.sort(marks);
        System.out.println("e) Sorted ascending: " + marks);
    }

}
