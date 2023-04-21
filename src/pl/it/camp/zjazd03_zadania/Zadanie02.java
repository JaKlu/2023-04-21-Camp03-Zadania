package pl.it.camp.zjazd03_zadania;

import java.util.Random;

/**
 * https://codingbat.com/prob/p127384
 * Return the sum of the numbers in the array, returning 0 for an empty array.
 * Except the number 13 is very unlucky, so it does not count
 * and numbers that come immediately after a 13 also do not count.
 * <p>
 * sum13([1, 2, 2, 1]) → 6
 * sum13([1, 1]) → 2
 * sum13([1, 2, 2, 1, 13]) → 6
 */
public class Zadanie02 {
    public static void main(String[] args) {
        int arrayQuantity = 4;

        int[] array0 = {};
        printArray(array0);
        System.out.println(sum13(array0));

        for (int i = 0; i < arrayQuantity; i++) {
            int[] array = generateArray(3, 12, 15);
            printArray(array);
            System.out.println(sum13(array));
        }
    }


    public static int sum13(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 13) {
                continue;
            }
            if (i > 0 && array[i - 1] == 13) {
                continue;
            }
            sum += array[i];
        }
        return sum;
    }

    public static int[] generateArray(int arraySize, int minBound, int maxBound) {
        Random random = new Random();
        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(minBound, maxBound + 1);
        }
        return array;
    }

    public static void printArray(int[] array) {
        StringBuilder sb = new StringBuilder().append("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        System.out.println(sb);
    }
}

