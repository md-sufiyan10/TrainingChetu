package TrainigChetu.Day_10_Inheritance;

class Student {
    private int age;
    private String name;
    // setter
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name){
        this.name=name;
    }

    public void show() {
        System.out.println("Age: " + age);
        System.out.println("Name:"+name);
    }
}

public class CommandLine {
    public static void main(String[] args) {

        int age = Integer.parseInt(args[0]); // CLA → int
         String name=args[1];
        Student s = new Student();
        s.setAge(age);   // setting value using setter
        s.setName(name);
        s.show();
    }
}
