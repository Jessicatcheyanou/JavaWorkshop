package main.chapter16;
/*Use of consumers to produce Side effects
and storing the state of the system in variables*/

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Exercise2 {
    static boolean alarmSericeNotified;

    public static void main(String[] args) {
        List<Sensor> sensors = new ArrayList<>();

        /*Create a list of Sensors and add a few Gateway sensors to it*/
        sensors.add(new Gateway(34,false));
        sensors.add(new Gateway(14,true));
        sensors.add(new Gateway(74,false));
        sensors.add(new Gateway(8,false));
        sensors.add(new Gateway(18,false));
        sensors.add(new Gateway(7,false));

        Predicate<Sensor> hasAlarmOrWarning = new HasAlarm().or(new HasWarning());

        if (sensors.stream().anyMatch(hasAlarmOrWarning)){
            System.out.println("Alarm or Warning was triggered");
        }

        /*Use a for loop to iterate through the list*/
        /*In the for loop,add an if statement that uses the predicate to check wether an alarm was triggered*/
       /* for (Sensor sensor:sensors){
            if (new HasAlarm().test(sensor)) {
                System.out.println("Alarm was triggered");
            }
            if (hasAlarmOrWarning.test(sensor)) {
                System.out.println("Alarm or Warning was triggered");
            }
        }*/

        SendAlarm sendAlarm = new SendAlarm();
        ResetAlarm resetAlarm = new ResetAlarm();
        sensors.stream().filter(hasAlarmOrWarning).forEach(sendAlarm.andThen(resetAlarm));

        if (alarmSericeNotified){
            System.out.println("Alarm service notified");
        }

        if (sensors.stream().anyMatch(hasAlarmOrWarning.negate())){
            System.out.println("Nothing was triggered");
        }

    }
}
