package pl.it.camp.zjazd03_zadania;

import java.util.Random;

/**
 * https://codingbat.com/prob/p194525
 * Given an array of ints, return true if the array contains no 1's and no 3's.
 * <p>
 * lucky13([0, 2, 4]) → true
 * lucky13([1, 2, 3]) → false
 * lucky13([1, 2, 4]) → false
 */
public class Zadanie03 {
    public static void main(String[] args) {
        int arrayQuantity = 10;

        for (int i = 0; i < arrayQuantity; i++) {
            int[] array = generateArray(10, 0, 9);
            printArray(array);
            System.out.println(lucky13(array));
        }
    }

    public static boolean lucky13(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1 || array[i] == 3) {
                return false;
            }
        }
        return true;
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
