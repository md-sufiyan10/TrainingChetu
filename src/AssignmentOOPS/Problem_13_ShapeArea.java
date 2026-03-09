package AssignmentOOPS;

class Shapes {
    public double area() {
        return 0;
    }
}
class Rectangles extends Shapes {
    private double length;
    private double width;

    public Rectangles(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}

public class Problem_13_ShapeArea {
    public static void main(String[] args) {
        Shapes s = new Rectangles(5, 3);
     //   System.out.println(s.area()); // Output: 15.0
        System.out.println("Area of a Rectangle: " + s.area());
    }
}