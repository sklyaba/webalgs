package ru.algs;

import java.util.Random;

public class PalindromeTest {

    private final static Random random = new Random();
    StringBuilder builtSecond = new StringBuilder();

    public static void main(String[] args) {

        int K = getNumBetween1000And9999();
        String s = String.valueOf(K);

        String firstOne = s.substring(0, 2);

        String secondOne = s.substring(2, 4);

        String reverse = getReversed(secondOne);

        if (firstOne.equals(secondOne) || firstOne.equals(reverse)) {
            System.out.println("This is Palindromic num");
        }
        else System.out.println("Nothing else!");

    }

    private static String getReversed(String secondOne) {
        StringBuilder builtSecond = new StringBuilder(secondOne);
        return builtSecond.reverse().toString();
    }

    private static int getNumBetween1000And9999() {
        int K = random.nextInt(9999);

        if (K <= 1000) {
            K = random.nextInt(9999);
        }
        return K;
    }
}
