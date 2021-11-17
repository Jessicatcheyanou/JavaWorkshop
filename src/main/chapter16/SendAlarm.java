package main.chapter16;

import java.util.function.Consumer;

public class SendAlarm implements Consumer<Sensor> {
    @Override
    public void accept(Sensor sensor){
        if (sensor.triggered()){
            Exercise2.alarmSericeNotified = true;
        }

    }
}
