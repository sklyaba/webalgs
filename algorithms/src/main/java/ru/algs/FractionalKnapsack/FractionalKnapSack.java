package ru.algs.FractionalKnapsack;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author dan on 7/31/20
 */

public class FractionalKnapSack {

    public static void main(String[] args) {

        final Item item1 = new Item(2, 14);
        final Item item2 = new Item(3, 18);
        final Item item3 = new Item(4, 20);

        final Item[] items = {item1, item2, item3};

        Arrays.sort(items, Comparator.comparing(Item::perValue).reversed());
        System.out.println(Arrays.toString(items));

        final int W = 7;

        int currentItem = 0;
        int weightSoFar = 0;
        double valueSoFar = 0;

        while (currentItem < items.length && weightSoFar != W) {
            if (weightSoFar + items[currentItem].getWeight() < W) {
                valueSoFar += items[currentItem].getValue();
                weightSoFar += items[currentItem].getWeight();
            } else {
                valueSoFar += ((W - weightSoFar) / (double) items[currentItem].getWeight()) *
                        items[currentItem].getValue();
                weightSoFar = W;
            }
            currentItem++;
        }

        System.out.println(valueSoFar);
    }

}

class Item {

    private final int weight;
    private final int value;

    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }

    public double perValue() {
        return value / (double) weight;
    }

    public int getWeight() {
        return weight;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "weight=" + weight +
                ", value=" + value +
                '}';
    }
}
