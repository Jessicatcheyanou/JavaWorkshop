package main.chapter16;

import java.util.function.Function;

public class ExtractBatteryHealth implements Function<Sensor,Integer> {
    @Override
    public Integer apply(Sensor sensor){
        return sensor.batteryHealth();
    }
}
