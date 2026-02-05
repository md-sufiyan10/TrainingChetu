package Day_8;

class Base {
    private int x;

    void show() {
        x++;
        System.out.println("x values:" + x);
    }
}
    public class Child extends Base{
        static void main() {
            Child c=new Child();
            c.show();

        }
    }

