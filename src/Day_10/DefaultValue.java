package Day_10;

public class DefaultValue {
    int x;
    double d;
    boolean b;
    String s;

    public void show(){
        System.out.println("Int x:"+x);
        System.out.println("Double d "+d);
        System.out.println("Boolean b:"+b);
        System.out.println("String s :"+s);
    }

    static void main() {
       new DefaultValue().show();
    }
}
