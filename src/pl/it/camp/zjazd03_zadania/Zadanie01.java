package pl.it.camp.zjazd03_zadania;

import java.util.Random;

/**
 * https://codingbat.com/prob/p162010
 * Return the number of even ints in the given array.
 * Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
 * <p>
 * countEvens([2, 1, 2, 3, 4]) → 3
 * countEvens([2, 2, 0]) → 3
 * countEvens([1, 3, 5]) → 0
 */
public class Zadanie01 {
    public static void main(String[] args) {
        int[] array = generateArray(10, 0, 101);
        printArray(array);

        System.out.println("Number of evens: " + countEvens(array));
    }

    public static int countEvens(int[] array) {
        int counter = 0;
        for (int element : array) {
            if (element % 2 == 0) {
                counter++;
            }
        }
        return counter;
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
