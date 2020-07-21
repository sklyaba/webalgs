package ru.algs;

import java.util.Random;

/**
 * @author dan on 7/21/20
 */

public class Division {

    private final static Random random = new Random();

    public static void main(String[] args) {

        double i = random.nextInt(100);
        double j = random.nextInt(100);


        System.out.println("i value is " + i);
        System.out.println("j value is " + j);
        System.out.println(doDivide(i, j));


    }

    private static double doDivide(double a, double b) {
        return (a / b);
    }
}
