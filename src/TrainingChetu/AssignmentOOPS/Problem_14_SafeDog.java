package TrainigChetu.AssignmentOOPS;

class Animal5{
    void eat(){
        System.out.println("Animal is Eating...");
    }
}
class Dog5 extends Animal5{
    void bark(){
        System.out.println("Dog is barking...");
    }
}
public class Problem_14_SafeDog {
    static void main() {
        Animal5 animal=new Dog5(); // upcasting
        animal.eat();

        if (animal instanceof Dog5) { // downcasting
            Dog5 dog=(Dog5)animal;
            dog.bark();
        }else {
            System.out.println("Not a Dog cant bark()...");
        }



    }
}
