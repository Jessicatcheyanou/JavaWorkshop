package main.chapter16;
/*Class that returns the trigger status of the sensor*/
import java.util.function.Predicate;

public class HasAlarm implements Predicate<Sensor> {
    @Override
    public boolean test(Sensor sensor){
        return sensor.triggered();
    }
}
