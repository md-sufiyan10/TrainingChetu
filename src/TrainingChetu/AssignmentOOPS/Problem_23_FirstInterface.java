package TrainigChetu.AssignmentOOPS;

interface Flyable{
    void fly();
}
class Bird implements Flyable{
    public void fly(){
        System.out.println("Bird is flying...");
    }
}
class Airplane implements Flyable{
    public void fly(){
        System.out.println("Airplane is flying...");
    }
}
public class Problem_23_FirstInterface {
    static void main() {
        Flyable f1=new Bird();
        Flyable f2=new Airplane();
        f1.fly();
        f2.fly();
    }
}
