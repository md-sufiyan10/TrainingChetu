package TrainigChetu.AssignmentOOPS;

class Animal4{
    void sound(){
        System.out.println("Animal Sound....");
    }
}
class Dog4 extends Animal4{
    void sound(){
        System.out.println("Dog sound ---Barks");
    }
}
class Cat4 extends Animal4{
    void sound(){
        System.out.println("Cat sound ---Meow");
    }
}
public class Problem_11_Poly_AnimalSound {
    public static void main(String[] args) {
        // Step 3
            Animal4[] animals = { new Dog4(), new Cat4() };

            for (Animal4 a : animals) {
                a.sound();
            }

        }

}
