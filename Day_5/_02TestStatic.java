package TrainigChetu.Day_5;

class Parent {
    static void display() {
        System.out.println("Parent static");
    }
}

class Child extends Parent {
    static void display() {  // This is HIDING, not overriding
        System.out.println("Child static");
    }
}

public class _02TestStatic{
    public static void main(String[] args) {
        Parent p = new Child();
        p.display();  // Output: "Parent static" (NOT polymorphic)

//        Child c = new Child();
//        c.display();  // Output: "Child static"
    }
}