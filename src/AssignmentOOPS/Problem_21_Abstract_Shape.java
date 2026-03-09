package AssignmentOOPS;

import java.util.Scanner;

abstract class Shape1 {
    abstract double area1();
}
class Rectangle1 extends Shape1 {
    private double length;
    private double breadth;
    Rectangle1(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    // implementation of abstract method area
   double area1() {
        return length * breadth;
    }
}
class Circles extends Shape1 {
    private final double radius;
    Circles(double radius) {
        this.radius = radius;
    }
    @Override
    // Implementation of abstract method area circle
    double area1() {
        return Math.PI * radius * radius;
    }
}
public class Problem_21_Abstract_Shape {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rectangle length: ");
        double length=sc.nextDouble();
        System.out.println("Enter the rectangle breadth: ");
        double breadth=sc.nextDouble();
     Shape1 s1=new Rectangle1(length,breadth);
     System.out.println("Rectangle area = " +s1.area1());

     System.out.println("Enter the circle radius: ");
     double radius=sc.nextDouble();
     Shape1 s2=new Circles(radius);
     System.out.printf("Circle Area = %.2f%n" , s2.area1());
    }
}
