package ru.algs;

import java.util.Random;

public class DifferentNums {

    private final static Random random = new Random();

    public static void main(String[] args) {
        int n = getN();

        String stringNum = String.valueOf(n);
        char first = stringNum.charAt(0);
        char second = stringNum.charAt(1);
        char third = stringNum.charAt(2);
        char fourth = stringNum.charAt(3);

        if (!((first == second) || (first==third) || (first == fourth)
            || (second == third) || (second == fourth) || (third == fourth))) {
            System.out.println("All nums are different!");
            System.out.println("This num is " + stringNum);
        }
        else {
            System.out.println("Some char has the same one");
            System.out.println("This num is "+stringNum);
        }
    }

    private static int getN() {
        int n = random.nextInt(9999);
        if (n<=9999) {
            n = random.nextInt(9999);
        }
        return n;
    }
}
