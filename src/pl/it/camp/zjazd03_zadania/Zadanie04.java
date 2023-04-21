package pl.it.camp.zjazd03_zadania;

import java.util.Random;

/**
 * https://codingbat.com/prob/p105771
 * Return an array that contains the exact same numbers as the given array,
 * but rearranged so that all the even numbers come before all the odd numbers.
 * Other than that, the numbers can be in any order.
 * You may modify and return the given array, or make a new array.
 * <p>
 * evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
 * evenOdd([3, 3, 2]) → [2, 3, 3]
 * evenOdd([2, 2, 2]) → [2, 2, 2]
 */

public class Zadanie04 {

    public static void main(String[] args) {
        int[] array;

        System.out.println("-".repeat(4) + "evenOdd() : same array" + "-".repeat(4));
        array = generateArray(10, 0, 10);
        printArray(array);
        evenOddSameArray(array);
        printArray(array);

        System.out.println();

        System.out.println("-".repeat(4) + "evenOdd() : new  array" + "-".repeat(4));
        array = generateArray(10, 0, 10);
        printArray(array);
        printArray(evenOddNewArray(array));
    }

    public static void evenOddSameArray(int[] array) {
        int temp;
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (!((array[i - 1]) % 2 == 0) && (array[i] % 2 == 0)) {
                    temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    isSorted = false;
                }
            }
        }
    }

    public static int[] evenOddNewArray(int[] array) {
        int[] sortedArray = new int[array.length];
        int j = 0;
        int k = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sortedArray[j] = array[i];
                j++;
            } else {
                sortedArray[k] = array[i];
                k--;
            }
        }
        return sortedArray;
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

