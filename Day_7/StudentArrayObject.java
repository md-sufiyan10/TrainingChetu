package TrainigChetu.Day_7;

import java.util.Scanner;

class Student{
    private String name;
    private int age;

    Student(){

    }
    Student(String name, int age){
        this.name=name;
        this.age=age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
public class StudentArrayObject {
    static void main() {
        Scanner scanner=new Scanner(System.in);
      //  Student stu=new Student();
        Student[] arr=new Student[3];

        for (int i=0; i<3;i++){

            System.err.println("Enter Details for Student "+(i+1)+":");

            System.out.println("Enter Student Name:");
            String nameTemp=scanner.nextLine();

            System.out.println("Enter Student Age:");
            int ageTemp=scanner.nextInt();
            scanner.nextLine();
            arr[i]= new Student(nameTemp,ageTemp);
        }

        System.out.println("=====Details Student=====");
        for (Student s: arr){
            System.out.println("Name:"+s.getName()+  ", Age :"+s.getAge());
        }
        scanner.close();
    }
}
