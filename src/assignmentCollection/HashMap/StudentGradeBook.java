package assignmentCollection.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class StudentGradeBook {

    public static void main(String[] args) {
        HashMap<String, Integer> grades = new HashMap<>();
//        Scanner sc = new Scanner(System.in);
//
//        int totalStudents = 4; // at least 4 inputs
//
//        for (int i = 1; i <= totalStudents; i++) {
//            System.out.println("Enter Student Name (" + i + "/" + totalStudents + "):");
//            String name = sc.next(); // use sc.nextLine() if you want full names with spaces
//
//            System.out.println("Enter Marks:");
//            int marks = sc.nextInt();
//
//            grades.put(name, marks);
//        }

        grades.put("Ram", 85);
        grades.put("Shyam", 92);
        grades.put("Geeta", 78);

        // a) Print all students with grades
        System.out.println("Printing all students with grades:");
        for (Map.Entry<String, Integer> entry : grades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        // b) Update Geeta's grade to 88
        grades.put("Geeta", 88);
        System.out.println("Updated Grade: " + grades.get("Geeta"));

        // c) Add new student "Ravi" = 95
        grades.put("Ravi", 95);
        System.out.println("Added new student: Ravi with grade 95");

        // d) Remove students with grade < 80
        grades.entrySet().removeIf(entry -> entry.getValue() < 80);
        System.out.println("Removed students with grade < 80");

        Iterator<Map.Entry<String, Integer>> itr = grades.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<String, Integer> entry = itr.next();
            if (entry.getValue() < 80) {
                itr.remove();
            }
        }
        System.out.println("Removed students with grade < 80");


        // e) Print average grade
        double averageGrade = grades.values().stream().mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println("Average Grade: " + averageGrade);

        grades.values().forEach(System.out::println);

    }
}