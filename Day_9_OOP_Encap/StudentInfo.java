package TrainigChetu.Day_9_OOP_Encap;

import java.util.Scanner;

public class StudentInfo {
    private String name;
    private int age;
    private int marks;
    private String stream;

    public void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student Name:");
        this. name=sc.next();
        System.out.println("Student Age:");
        this. age=sc.nextInt();

        System.out.println("Student Marks:");
        this.marks=sc.nextInt();
    }
    public void allocate(){
        if (marks>=300)
            stream="Computer & Science";
        else if(marks>=200 && marks<=300)
            stream="Commarce & Art";
        else if(marks>=75 && marks<=200)
            stream="Animation";
        else
            stream="Try Aggain Yr Fail";
    }
    public void printDisplay(){
        System.out.println("Student name:"+name);
        System.out.println("Student Age:"+age);
        System.out.println("Student Marks:"+marks);
        System.out.println("Student Stream :"+stream);
    }

    static void main() {
        StudentInfo s=new StudentInfo();
        s.accept();
        s.allocate();
        s.printDisplay();
    }
}
