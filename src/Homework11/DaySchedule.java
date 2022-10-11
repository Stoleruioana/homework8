package Homework11;

public class DaySchedule {
    String day;
    String schedule;

    public DaySchedule(DaysOfTheWeek day, String activities) {
        this.day=day;
        this.schedule = activities;
    }

    public String getDay() {
        return day;
    }

    public String getSchedule() {
        return schedule;
    }
}
