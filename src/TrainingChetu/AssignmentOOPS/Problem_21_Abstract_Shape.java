package TrainigChetu.AssignmentOOPS;

import java.util.Scanner;

abstract class Shapes {
    abstract double area();
}
class Rectangles extends Shapes {
    private double length;
    private double breadth;
    Rectangles(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    // implementation of abstract method area
   double area() {
        return length * breadth;
    }
}
class Circles extends Shapes {
    private final double radius;
    Circles(double radius) {
        this.radius = radius;
    }
    @Override
    // Implementation of abstract method area circle
    double area() {
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
     Shapes s1=new Rectangles(length,breadth);
     System.out.println("Rectangle area = " +s1.area());

     System.out.println("Enter the circle radius: ");
     double radius=sc.nextDouble();
     Shapes s2=new Circles(radius);
     System.out.printf("Circle Area = %.2f%n" , s2.area());
    }
}
