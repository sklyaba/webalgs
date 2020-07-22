package ru.algs;

import lombok.extern.slf4j.Slf4j;

import java.math.BigInteger;

/**
 * @author dan on 7/21/20
 */

@Slf4j
public class Counters {

    public static void main(String[] args) {

        BigInteger bigInteger = new BigInteger("101");
        BigInteger bigPower = new BigInteger("1000");

        int[] initTable = init(49);

        for (int i = 0; i < 49; i++) {
            bigInteger = bigInteger.multiply(bigPower);
            bigInteger=bigInteger.add(new BigInteger(String.valueOf(initTable[i])));
        }
        System.out.println(bigInteger);
        log.info(bigInteger.toString());

    }

    private static int get3multiplyNum() {
        return 0;
    }

    private static int getIndividualNum1() {
        return 0;
    }

    private static int getIndividualNum2() {
        return 0;
    }

    private static int[] init(int N) {
        int[] countTable = new int[N];
        int count = 101;
        for (int i = 0; i < N; i++) {
            count++;
            countTable[i] = count;
        }
        return countTable;
    }
}
