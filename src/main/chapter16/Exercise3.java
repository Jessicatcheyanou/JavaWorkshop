package main.chapter16;
/*Extracting Data-Extract all of the alarm system data as integers
* :battery percentages,temperatures,triggered status,and others,depending on how far
* you've taken your alarm systrm*/

import java.util.ArrayList;
import java.util.List;

public class Exercise3 {
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
       /*Print your battery health to the terminal*/
        for (int i=0;i<batteryHealths.length;i++){
            System.out.println((batteryHealths[i]));
        }
      ;
    }
}
