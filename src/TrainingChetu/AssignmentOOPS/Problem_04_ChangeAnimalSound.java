package TrainingChetu.AssignmentOOPS;

class Animal2{
    void sound(){
        System.out.println("Animal Sound....");
    }
}
class Dog2 extends Animal2{
    void sound(){
        System.out.println("Dog sound ---Woof");
    }
}
public class Problem_04_ChangeAnimalSound {
    static void main() {
       Animal2 animal=new Dog2();
       animal.sound();
        System.out.println("-------------");
        Animal2 animal1=new Animal2();
        animal1.sound();

    }
}
