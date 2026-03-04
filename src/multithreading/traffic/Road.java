package multithreading.traffic;

public class Road {
    static void main() throws InterruptedException {
        TrafficLightThread red=new TrafficLightThread(TrafficColor.RED);
        TrafficLightThread green=new TrafficLightThread(TrafficColor.GREEN);
        TrafficLightThread yellow=new TrafficLightThread(TrafficColor.YELLOW);

        red.start();
        red.join();
        green.start();
        green.join();
        yellow.start();

    }
}
