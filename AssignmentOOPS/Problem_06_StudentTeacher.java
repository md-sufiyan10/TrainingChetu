package TrainigChetu.AssignmentOOPS;
class Person {
   protected String name;
    Person(String name) {
        this.name = name;
    }
    void showInfo() {
        System.out.println("Name: " + name);
    }
}
class Student extends Person {
    private int rollNo;
    Student(String name, int rollNo) {
        super(name);
        this.rollNo = rollNo;
    }
    @Override
    void showInfo() {
       super.showInfo();  // reuse parent information
        System.out.println("Roll No: " + rollNo);
    }
}
class Teacher extends Person {
   private String subject;
    Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }
    @Override
    void showInfo() {
        super.showInfo();  // reused parent logic
        System.out.println("Subject: " + subject);
    }
}
public class Problem_06_StudentTeacher {
    static void main() {
        Person s = new Student("Sufiyan", 101);
        Person t = new Teacher("Gautam Sir", "Java");
        s.showInfo();
        System.out.println();
        t.showInfo();
    }
}
