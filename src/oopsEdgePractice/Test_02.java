package oopsEdgePractice;
//Q7. Can constructors be inherited? ✅ No

class Parents{
    Parents(){
        System.out.println("Parent Constructor");
    }
}
class Childs extends Parents{
    Childs(){
        System.out.println("Child Constructor");
        super();
    }
}

public class Test_02 {
    static void main() {
        Childs c=new Childs();
    }
}
