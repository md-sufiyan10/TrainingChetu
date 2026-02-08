package TrainigChetu.AssignmentOOPS;

class Vehicles {
    public void move(){
        System.out.println("Vehicle is moving...");
    }
}
class Cars extends Vehicles {
    public void move(){
        System.out.println("Car is moving...");
    }
}
class Bikes extends Vehicles {
    public void move(){
        System.out.println("Bike is moving...");
    }
}
public class Problem_17_Diff_Vehicle {
    static void main() {
        Vehicles v1=new Cars();
        v1.move();
        Vehicles v2=new Bikes();
        v2.move();
    }
}
