package main.chapter16;

import java.util.function.Consumer;

public class ResetAlarm implements Consumer<Sensor> {
    @Override
    public void accept(Sensor sensor){
        sensor.triggered(false);
        sensor.batteryHealth(50);

        Exercise2.alarmSericeNotified = false;
    }
}
