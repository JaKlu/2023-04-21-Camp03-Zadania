package pl.it.camp.zjazd03_zadania;

import java.util.Random;

/**
 * https://codingbat.com/prob/p193753
 * Return an array that contains the exact same numbers as the given array,
 * but rearranged so that all the zeros are grouped at the start of the array.
 * The order of the non-zero numbers does not matter. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}.
 * You may modify and return the given array or make a new array.
 * <p>
 * zeroFront([1, 0, 0, 1]) → [0, 0, 1, 1]
 * zeroFront([0, 1, 1, 0, 1]) → [0, 0, 1, 1, 1]
 * zeroFront([1, 0]) → [0, 1]
 */
public class Zadanie05 {

    public static void main(String[] args) {
        int arrayQuantity = 3;
        int arraySize = 10;
        int minBound = 0;
        int maxBound = 2;
        int[] testArray;

        System.out.println("-".repeat(3) + "zeroFront() : same array" + "-".repeat(3));

        for (int i = 0; i < arrayQuantity; i++) {
            testArray = generateArray(arraySize, minBound, maxBound);
            printArray(testArray);
            zeroFrontSameArray(testArray);
            printArray(testArray);
            System.out.println();
        }

        System.out.println("-".repeat(3) + "zeroFront() : new  array" + "-".repeat(3));

        for (int i = 0; i < arrayQuantity; i++) {
            testArray = generateArray(arraySize, minBound, maxBound);
            printArray(testArray);
            printArray(zeroFrontNewArray(testArray));
            System.out.println();
        }
    }


    public static void zeroFrontSameArray(int[] array) {   // same array
        int counter = -1;
        int temp;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                counter++;
                temp = array[counter];
                array[counter] = array[i];
                array[i] = temp;
            }
        }
    }

    public static int[] zeroFrontNewArray(int[] array) {   // new array
        int[] newArray = new int[array.length];
        int countZero = -1;
        int countNonZero = array.length;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                countZero++;
                newArray[countZero] = array[i];
            } else {
                countNonZero--;
                newArray[countNonZero] = array[i];
            }
        }
        return newArray;
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
