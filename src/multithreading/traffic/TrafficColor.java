package multithreading.traffic;

public enum TrafficColor {
    RED(9000),
    GREEN(3000),
    YELLOW(1000);

    private final int onTimeInMills;

    public int getOnTimeInMills() {
        return onTimeInMills;
    }
    TrafficColor(int onTimeInMills){
        this.onTimeInMills=onTimeInMills;
    }
}
