package TrainigChetu.AssignmentOOPS;


class Animal3{
    void sounds(){
        System.out.println("Animal is Eating...");
    }
}
class Dog3 extends Animal3{
    void sounds(){
        System.out.println("Dog is barking...");
    }
}
class Cat3 extends Animal3{
    void sounds(){
        System.out.println("Cat is meowing...");
    }
}
public class Problem_15_MixAnimals {
    static void main() {
        Animal3[] animals = { new Dog3(), new Cat3(),new Dog3() };
        for (Animal3 a : animals) {
            a.sounds();
        }
    }
}
