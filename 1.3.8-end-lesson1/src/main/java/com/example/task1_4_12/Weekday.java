package com.example.task1_4_12;


public class Weekday {

    public static String isWeekend(String weekday) {
            if (weekday.equals("Saturday") || weekday.equals("Sunday")) {
                return "Ура, выходной!";
            } else {
                return "Надо поработать";
            }
    }
}
