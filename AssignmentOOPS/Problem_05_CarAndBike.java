package TrainigChetu.AssignmentOOPS;

interface Vehicle{
    void start();
}
class Car implements Vehicle{
    public void start(){
        System.out.println("Car Engine Started...");
    }
}
class Bike implements Vehicle{
    public void start(){
        System.out.println("Bike Engine Started...");
    }
}

public class Problem_05_CarAndBike {
    static void main() {
        Vehicle car=new Car();
        car.start();
        System.out.println("------------");
        Vehicle bike=new Bike();
        bike.start();



    }
}
