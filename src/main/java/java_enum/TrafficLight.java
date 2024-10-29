package java_enum;

/**
 * Created by NghiaPV on 8/31/2017.
 */
public enum TrafficLight {

    Red(50), Green(30), Yellow(10);

    private final int seconds;

    TrafficLight(int seconds) {
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }
}
