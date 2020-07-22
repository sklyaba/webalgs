package ru.algs;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class HolidaysInYear {

    private final static Random random = new Random();

    public static void main(String[] args) {
        int days = 365;

        getWeekendDayOrNot(days);

    }

    private static void getWeekendDayOrNot(int days) {
        int randomDay = random.nextInt(days);

        if (randomDay % 6 == 0) {
            System.out.println("Today is " + randomDay +" of the year. This is " + DAY.SATURDAY);
        } else if (randomDay % 7 == 0) {
            System.out.println("Today is " + randomDay +" of the year. This is " + DAY.SUNDAY);
        }
        else System.out.println("Today is " + randomDay +" of the year. This is" + " HARD WORKING DAY!");
    }
}

enum DAY {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}
