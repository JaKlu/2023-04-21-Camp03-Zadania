package pl.it.camp.zjazd03_zadania;

import java.util.Random;

/**
 * https://codingbat.com/prob/p110019
 * Given an array of ints, return the number of times that two 6's are next to each other in the array.
 * Also count instances where the second "6" is actually a 7.
 * <p>
 * array667([6, 6, 2]) → 1
 * array667([6, 6, 2, 6]) → 1
 * array667([6, 7, 2, 6]) → 1
 */
public class Zadanie10 {
    public static void main(String[] args) {
        System.out.println(array667(new int[]{6, 6, 2}));
        System.out.println(array667(new int[]{6, 6, 2, 6}));
        System.out.println(array667(new int[]{6, 7, 2, 6}));
    }

    public static int array667(int[] array) {
        int counter = 0;
        for (int i = 1; i < array.length; i++) {
            if ((array[i] == 6 || array[i] == 7) && (array[i - 1] == 6)) {
                counter++;
            }
        }
        return counter;
    }

    public static int[] generateArray(int arraySize, int minBound, int maxBound) {
        int[] array = new int[arraySize];
        Random random = new Random();
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
