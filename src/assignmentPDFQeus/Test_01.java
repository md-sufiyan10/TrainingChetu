package TrainigChetu.src.assignmentPDFQeus;

//interface A {
//    default void m(){
//        System.out.println("A");
//    }
//}
//interface B {
//    default void m(){
//        System.out.println("B");
//    }
//}
//class C implements A, B {
//    @Override
//    public void m() {
//        A.super.m();
//        B.super.m();
//    }
//}

class Parent {
    void parentMethod() {
        System.out.println("Parent method");
    }
    void show(){
        System.out.println("Parent show");
    }
}

class Child extends Parent {
    void childMethod() {
        System.out.println("Child-only method");
    }
    void show(){
        System.out.println("Child show");
    }
}

public class Test_01 {
    public static void main(String[] args) {
        Parent p = new Child();  // Upcasting
        p.parentMethod(); // ✅ allowed (Parent has this method)

        Parent pp = new Parent();
        pp.parentMethod();

        Child c = new Child();
         c.childMethod(); // ❌ Compile-time error:
         c.parentMethod();
        // "cannot find symbol method childMethod()"

        System.out.println("-----------------");
        Parent cc = new Child();
        cc.show();
    }
}
