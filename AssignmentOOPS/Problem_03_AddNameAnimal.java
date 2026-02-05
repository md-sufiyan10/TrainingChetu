package TrainigChetu.AssignmentOOPS;

class Animal1{
      String name;
    Animal1(String name){
        this.name=name;
        System.out.println(name);
    }
}
class Dog1 extends Animal1{
    Dog1(String name){
        super(name);
    }
}
public class Problem_03_AddNameAnimal {
    static void main() {
      Dog1 d1=new Dog1("Tommy");
      System.out.println(d1.name);
    }
}
