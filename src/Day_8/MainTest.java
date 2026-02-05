package Day_8;

import java.util.Scanner;

public class MainTest {
    static void main() {
//        Dog d=new Dog();
//        d.setName("Pink...");
//        d.setBreed("Labrador");
//        d.setAge(5);
//
//        d.displayDetails();
//        d.eat(); d.bark();
//        System.out.println("----------------------");
//
//        Dog d1=new Dog("Yara","Sing",12);
//        d1.displayDetails();
//        d1.eat(); d1.bark();

//        Employee em=new Employee(101,"Sufiyan",4000);
//        em.displayDetails();
//
//        System.out.println("After Updating Salary");
//        em.updateSalary();
//        em.displayDetails();

        Rectangle r=new Rectangle(5,6);
        r.CalculateArea();
        r.findPerimeter();
        r.display();
        System.out.println("--------------");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Heigt :");
        int height=scanner.nextInt();
        System.out.println("Enter Width:");
        int width=scanner.nextInt();
        Rectangle r1=new Rectangle(height,width);
        r1.CalculateArea();
        r1.findPerimeter();
        r1.display();
    }
}
