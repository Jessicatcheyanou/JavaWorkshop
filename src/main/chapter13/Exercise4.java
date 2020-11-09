package main.chapter13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Exercise4 {

    public static void main(String[] args) {
        List<Tire> tires = List.of(new Tire(13),new Tire(14),new Tire(15),new Tire(18),new
                Tire(23));

        System.out.println(getSortedList(tires));
    }

    public static List<Tire> getSortedList(List<Tire> tires){
        List<Tire> sorted = new ArrayList<>(tires);
        sorted.sort((t1,t2) -> t2.size - t1.size);

        return List.copyOf(sorted);
    }

    public static  final class Tire {
        private final int size;

        public Tire(int size){
            this.size = size;
        }

        @Override
        public String toString(){
            return String.valueOf(size);
        }
    }
}
