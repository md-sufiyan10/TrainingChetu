package TrainigChetu.Day_5;

// Question 1: Can we use instance variable in static method?
public class _01Question {
    int instanceVar = 10;  // Instance variable
    static int y=20;
    public static void staticMethod() {
          //System.out.println(instanceVar);  // getting error

        // Solution:
//        Question_01 obj = new Question_01();
//        System.out.println("Instance variable: "+obj.instanceVar);
//        System.out.println(" static variable "+y);
    }

    // Question 2: Can we use static variable in instance method?

    static int staticVar=30;
    public void instanceMethod(){
        System.out.println("Static variable inside Instance method Access Dirctly :"+staticVar);
        System.out.println("Direct Acces Usinc Class Name:"+ _01Question.staticVar);

    }
    //Q2: Can static method call instance method?
//     void instance2(){
//         System.out.println("Instance method...");
//     }
//     static void staticMethd(){
//         System.out.println("Static Metod called...");
//
//        // instance2(); Direct call not allow
//         Question_01 k=new Question_01();
//         k.instance2();
//     }

    static void main() {
//        staticMethod();
//        Question_01 instance=new Question_01();
//        instance.instanceMethod();
//        System.out.println("============");
//        staticMethd();
    }
}
