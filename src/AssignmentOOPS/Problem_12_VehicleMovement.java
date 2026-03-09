package AssignmentOOPS;
// Q12: Vehicle Movement - Method Overriding + Runtime Polymorphism

class Vehicles {
    public void move() {
        System.out.println("Vehicle moves");
    }
}

class Cars extends Vehicles {
    @Override
    public void move() {
        System.out.println("Car drives");
    }
}

class Bikes extends Vehicles {
    @Override
    public void move() {
        System.out.println("Bike rides");
    }
}

public class Problem_12_VehicleMovement {
     static void main(String[] args) {

        Vehicles v1 = new Cars();
        v1.move();   // Output: Car drives

         Vehicles v2 = new Bikes();
         v2.move();  // Bike rides
    }
}
