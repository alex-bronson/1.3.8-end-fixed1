package com.example.task1_4_12;


public class Weekday {

    public static String isWeekend(String weekday) {
            return (weekday.equals("Sunday") || weekday.equals("Saturday"))
                    ? "Ура выходной!"
                    : "Надо поработать";
    }
}
