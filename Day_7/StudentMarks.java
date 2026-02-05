package TrainigChetu.Day_7;

import java.util.Scanner;

class Students{
    private String name;
    private int age;
    private int marks;
    private String stream;

    public Students(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;

    }
     Students(){
    }

//    public void accept(){
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Student Name:");
//        this.name=scanner.next();
//
//        System.out.println("Student Age:");
//       this.age=scanner.nextInt();
//
//        System.out.println("Student Marks:");
//        this. marks=scanner.nextInt();
//
//    }

    void allocation(){
        if (marks >=300) stream="Science & Computer ";
        else if (marks>=200 && marks <=300) stream="Commerce & Computer";
        else if(marks >=75 && marks <=200) stream="Art & Animation";
        else stream="Try Agian";
    }
    void display(){
        System.out.println("====Student Details====");
        System.out.println("Student Name:"+name);
        System.out.println("Student Age:"+age);
        System.out.println("Student Marks:"+marks);
        System.out.println("Student Stream :"+stream);
    }
}
public class StudentMarks {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Student Name:");
        String name=sc.next();
        System.out.println("Student Age:");
        int age=sc.nextInt();
        System.out.print("Student Marks: ");
        int marks = sc.nextInt();

        Students s=new Students(name,age,marks);
        s.allocation();
        s.display();

    }

    /*  Student Name:
Sufiyan
Student Age:
21
Student Marks:
700
====Student Details====
Student Name:null
Student Age:0
Student Marks:0
Student Stream :Try Agian */
}
