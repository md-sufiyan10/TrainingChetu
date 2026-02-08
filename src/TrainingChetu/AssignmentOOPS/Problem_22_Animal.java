package TrainigChetu.AssignmentOOPS;

abstract class Animal6 {
    abstract void sound();
}
class Dog6 extends Animal6 {
    void sound() {  // implemented abstract method sound
        System.out.println("Barking.Woof..");
    }
}
public class Problem_22_Animal {
    static void main() {
     //Animal6 a=new Animal6(); compilation error abstract class cannot be instantiated
        Animal6 d=new Dog6();
        d.sound();
    }
}
