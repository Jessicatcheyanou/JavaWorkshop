package main.chapter6.steps;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class WeeklySteps {
    List<Steps> dailySteps = new ArrayList<>();
    DailyGoal dailyGoal;

    public List<Steps> getDailySteps() {
        return dailySteps;
    }

    public void setDailySteps(List<Steps> dailySteps) {
        this.dailySteps = dailySteps;
    }

    public DailyGoal getDailyGoal() {
        return dailyGoal;
    }

    public void setDailyGoal(DailyGoal dailyGoal) {
        this.dailyGoal = dailyGoal;
    }

    public DayOfWeek bestDay(){
        DayOfWeek best = DayOfWeek.WEDNESDAY;
         int max = 0;
        for (Steps steps: dailySteps )
        {

            if (steps.getSteps() > max) {
                best = steps.getDate().getDayOfWeek();
            }
        }
        return best;
    }

    public int getTotalSteps() {
        int total = 0;
        for (Steps steps : dailySteps){
            total = steps.getSteps();
        }
        return total;
    }

    public String format(){

        StringBuilder builder = new StringBuilder();
        builder.append("Total steps:").append(getTotalSteps()).append("\n");

        for (Steps steps: dailySteps){
            if (dailyGoal.hasMetGoal(steps)){
                builder.append("YAY!");
            } else {
                builder.append("**");
            }

            builder.append(steps.getDate().getDayOfWeek());
            builder.append(steps.getSteps());

            DayOfWeek best = bestDay();
            if (steps.getDate().getDayOfWeek() == best){
                builder.append("******* BEST DAY!");
            }
            builder.append("\n");
        }

        return builder.toString();
    }

    public void addDailySteps(int steps, LocalDate date){
        dailySteps.add(new Steps(steps,date));
    }

    public static void main(String[] args) {
        //Initialize sample data
        DailyGoal dailyGoal = new DailyGoal(10000);

        WeeklySteps weekly = new WeeklySteps();
        weekly.setDailyGoal(dailyGoal);

        int year = 2021;
        int month = 1;
        int day = 4;

        weekly.addDailySteps(11543,LocalDate.of(year,month,day));
        day++;
        weekly.addDailySteps(11403,LocalDate.of(year,month,day));
        day++;
        weekly.addDailySteps(10543,LocalDate.of(year,month,day));
        day++;
        weekly.addDailySteps(12483,LocalDate.of(year,month,day));

        System.out.println(weekly.format());
    }

}
