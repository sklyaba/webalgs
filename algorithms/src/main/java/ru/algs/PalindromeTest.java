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

        int a = 1;
        int n = 10;

        boolean isThree = isEvenSum(1, 10);
        System.out.println(isThree);

    }

    private static boolean isEvenSum(int a, int n) {
        boolean isThree=false;
        for (int i = n; i>a; i = i-3) {
            if (i == 3) {
                isThree = true;
                break;
            }
        }
        return isThree;
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
