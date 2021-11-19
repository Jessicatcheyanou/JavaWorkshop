package main.chapter16;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Activity2 {
    public static void main(String[] args) {
        List<Sensor> sensors = new ArrayList<>();
        sensors.add(new Gateway(34,false));
        sensors.add(new Gateway(14,true));
        sensors.add(new Fire(78,false,21));
        sensors.add(new Gateway(74,false));
        sensors.add(new Gateway(8,false));
        sensors.add(new Movement(87,false,45));
        sensors.add(new Gateway(18,false));
        sensors.add(new Fire(32,false,23));
        sensors.add(new Gateway(9,false));
        sensors.add(new Movement(76,false,41));

        ExtractBatteryHealth extractBatteryHealth = new ExtractBatteryHealth();

      /*Use the java streams map operation and apply your new instance of ExtractBatteryHealth.Terminate the stream with a toArray
      operation
       */
        Integer[] batteryHealths = sensors.stream().map(extractBatteryHealth).toArray(Integer[]::new);

        /*Using the Streams API,Calculate average battery Health*/
        Stream.of(batteryHealths).mapToInt(i -> i).average().ifPresent(avg -> System.out.println("Using the Streams API,The average Battery Health is :"+avg));

        /*Print your battery health to the terminal*/
        int sum = 0;
        int avg = 0;
        for (int i=0;i<batteryHealths.length;i++){
           sum = sum + batteryHealths[i];
        }
        avg = sum / batteryHealths.length;
        System.out.println("Using the for loop,Sum of Battery health is:"+sum);
        System.out.println("Using the for loop,Average sum of Battery health is:" + avg );

    }
}
