package Day_8;

public class Rectangle {
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int CalculateArea(){
        return height*width;
    }
    public double findPerimeter(){
        return 2* (height+width);
    }
    public void display(){
        System.out.println("============Rectangle Details============");
        System.out.println("Height :"+height);
        System.out.println("Width :"+width);
        System.out.println("Area : "+CalculateArea());
        System.out.println("Perimeter:"+findPerimeter());
    }
}
