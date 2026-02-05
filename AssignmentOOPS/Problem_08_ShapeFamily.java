package TrainigChetu.AssignmentOOPS;
class Shape {
    void printDetails() {
        System.out.println("This is a shape");
    }
    double area(){
        return 0;
    }
    double perimeter(){
        return 0;
    }
}
class Rectangle extends Shape{
    private int length;
    private int width;
    Rectangle(int length, int width){
     this.length=length;
     this.width=width;
    }
    public double area(){
        return length*width;
    }
    public double perimeter(){
        return 2*(length+width);
    }
    public void printDetails(){
        System.out.println("====Rectangle Details====");
        System.out.println("Length : "+length);
        System.out.println("Width : "+width);
    }
}
class Circle extends Shape{
    private double radious;
     Circle(double radious){
        this.radious=radious;
    }
    double area(){
         return Math.PI*radious*radious;
    }
    double perimeter(){
         return 2*Math.PI*radious;
    }
    public  void printDetails(){
        System.out.println("=====Circle Details=====");
        System.out.println("Circle Radious:"+radious);
    }
}

public class Problem_08_ShapeFamily {
    static void main() {
    Shape r=new Rectangle(20,10);
    r.printDetails();
        System.out.println("Rectangle Area:"+r.area());
        System.out.println("Rectangle Perimeter:"+r.perimeter());
        System.out.println("----------------------");
    Shape c=new Circle(5);
    c.printDetails();
        System.out.printf("Circle Area :%.2f%n", c.area());
        System.out.printf("Circle Perimeter :%.2f%n" ,c.perimeter());

    }
}
