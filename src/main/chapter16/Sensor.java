package main.chapter16;

public interface Sensor {
    int batteryHealth();
    void batteryHealth(int health);
    boolean triggered();
    void triggered(boolean state);
}
