package TrainingChetu.AssignmentOOPS;

class Animal{
    void eat(){
        System.out.println("Animal is Eating...");
    }

    public void makeSound() {
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking...");
    }
}
public class Problem01 {
    static void main() {
   Animal animal=new Animal();
   animal.eat();

   Animal dog=new Dog();
   dog.eat();
   //dog.bark(); error
        System.out.println("----------------");
    Dog d=new Dog();
    d.eat();
    d.bark();
    }
}
