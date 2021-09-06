package main.chapter6.steps;

public class DailyGoal {

    int dailyGoal = 10000;

    public DailyGoal(int dailyGoal) {
        this.dailyGoal = dailyGoal;
    }

    /*method to define wether the steps objects has achieved the daily goal*/

    public boolean hasMetGoal(Steps steps){
        if (steps.getSteps() >= dailyGoal){
            return true;
        }
        return false;
    }
}
