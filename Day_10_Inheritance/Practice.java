package TrainigChetu.Day_10_Inheritance;

//    class A {
//        int x = 10;
//    }
//    class B extends A {
//        int x = 20;
//    }
//
//    public class Practice {
//        public static void main(String[] args) {
//            A a = new B();
//            System.out.print(a.x);
//        }
//    }
class A {
    A(){

        System.out.println("A Constructor");
    }
    void show() {
        System.out.print("A");
    }
}

class B extends A {
    B(){
        System.out.println("B Constructor");

    }

    void show() {
        System.out.print("B");
    }
}

public class Practice {
    public static void main(String[] args) {
        B a = new B();
      //  a.show();
    }
}


