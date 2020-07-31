package ru.algs.fibonacci;

import java.util.Arrays;

/**
 * @author dan on 7/31/20
 */

public class FibonacciNums {

    public static void main(String[] args) {

//        System.out.println(getNumFibonacciFrom(100));

        int n = 100;
        FibonacciByMemoization fibonacci = new FibonacciByMemoization(n);
        long [] mem = new long[n+1];
        Arrays.fill(mem, -1);
        System.out.println(fibonacci.fibonacciByMemoization(n, mem));
    }

    private static long getNumFibonacciFrom(int n) {
        long[] array = new long[n + 1];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i<= n; i++)
            array[i] = array[i-1] + array[i-2];
        return array[n];
    }
}

class FibonacciByMemoization {
    int n;


    public FibonacciByMemoization(int n) {
        this.n = n;
    }

    public long fibonacciByMemoization(int n, long[] mem) {
        if(mem[n] != -1) {
            return mem[n];
        }

        if(n <= 1) {
            return n;
        }

        long res = fibonacciByMemoization(n-1, mem) + fibonacciByMemoization(n-2, mem);
        mem[n] = res;

        return res;
    }
}
