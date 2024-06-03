package com.example.task1_4_10;


public class Weekday {

    public static boolean isWeekend(String weekday) {
        switch (weekday) {
            case "Saturday":
            case "Sunday":
                return true;
            default:
                return false;
        }
    }
}
