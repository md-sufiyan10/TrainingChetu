package oopsEdgePractice;

class Parent
{
    private int secret=42;
    // public/protected method to access the private field
    protected int getSecret(){
       return secret;
    }
}
class Child extends Parent
{
    // Not allowed (compile error):
     // System.out.println(secret);

    // Allowed: access through method
    public void show(){
        System.out.println("Secret is:"+getSecret());
    }
}
public class Test_01 {
    static void main() {
    Child c=new Child();
     c.show();
    }
}
