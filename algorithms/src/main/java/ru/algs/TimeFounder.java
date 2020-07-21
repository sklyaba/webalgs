package ru.algs;


import lombok.SneakyThrows;

import java.util.Scanner;

/**
 * @author dan on 7/21/20
 */

public class TimeFounder {

    private final static double DEGREES = 360;
    private final static double HOUR = DEGREES / 24;
    private final static double ONE_DEGREE = HOUR / 30; //0.25
    private final static int MINUTES = 60;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int y = in.nextInt();
        getTime(y);


    }

    @SneakyThrows
    private static void getTime(int y) {
        if (y < 1 || y > 360)
            throw new TimeException("Please type the value less 360 and more 1 then repeat the launch");

        double summaryMinutes = 0;
        int hourAnswer;
        int minuteAnswer;

        summaryMinutes = y / ONE_DEGREE; // все в минуты
        hourAnswer = (int) summaryMinutes / MINUTES; // полные часы
        minuteAnswer = (int) ((summaryMinutes % MINUTES)); // полные минуты
        if (hourAnswer == 0) {
            System.out.println("Прошло в итоге " + minuteAnswer + " минут.");
        } else {
            System.out.println("Прошло в итоге " + hourAnswer + " часов " + minuteAnswer + " минут.");
        }

    }
}

class TimeException extends Exception {

    public TimeException(String message) {
        super(message);
    }
}