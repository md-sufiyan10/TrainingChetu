package TrainigChetu.AssignmentOOPS;

interface Vehicle1{
    default void start(){
        System.out.println("Vehicle Started...");
    }
    abstract void stop();
}
class Car1 implements Vehicle1{
    @Override
    public void start(){
        Vehicle1.super.start();
        System.out.println("Car Enginee Started...");
    }
    @Override
    public void stop() {
        System.out.println("Car Stopped...");
    }
}
public class Problem_27_InterfaceDefault {
    static void main() {
        Vehicle1 v=new Car1();
        v.start();// calls default start() from Vehicle (if Car doesn't override)
        v.stop();
    }

}
