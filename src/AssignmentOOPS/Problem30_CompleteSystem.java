package AssignmentOOPS;

// Q30: Complete System

abstract class Device {
    abstract void powerOn();
}

interface Connectable {
    void connect();
}
class Smartphones extends Device implements Connectable {
    @Override
    void powerOn() {
        System.out.println("Smartphone is powering on...");
    }

    @Override
    public void connect() {
        System.out.println("Smartphone connected to network.");
    }
}
public class Problem30_CompleteSystem {
     static void main() {
        Smartphones phone = new Smartphones();
        phone.powerOn();
        phone.connect();

        System.out.println("-------------");
        Device  device = new Smartphones();
        device.powerOn();

    }
}
