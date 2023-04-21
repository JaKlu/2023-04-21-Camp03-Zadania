package pl.it.camp.zjazd03_zadania;

/**
 * https://codingbat.com/prob/p125819
 * (This is a slightly harder version of the fix34 problem.)
 * Return an array that contains exactly the same numbers as the given array,
 * but rearranged so that every 4 is immediately followed by a 5.
 * Do not move the 4's, but every other number may move.
 * <p>
 * The array contains the same number of 4's and 5's,
 * and every 4 has a number after it that is not a 4.
 * In this version, 5's may appear anywhere in the original array.
 * <p>
 * fix45([5, 4, 9, 4, 9, 5]) → [9, 4, 5, 4, 5, 9]
 * fix45([1, 4, 1, 5]) → [1, 4, 5, 1]
 * fix45([1, 4, 1, 5, 5, 4, 1]) → [1, 4, 5, 1, 1, 4, 5]
 */
public class Zadanie07 {
    public static void main(String[] args) {
        int[] array1 = new int[]{5, 4, 1};
        int[] array2 = new int[]{1, 4, 1, 5};
        int[] array3 = new int[]{1, 4, 1, 5, 5, 4, 1};

        printArray(array1);
        fix45(array1);
        printArray(array1);
        System.out.println("-".repeat(25));
        printArray(array2);
        fix45(array2);
        printArray(array2);
        System.out.println("-".repeat(25));
        printArray(array3);
        fix45(array3);
        printArray(array3);
    }

    public static int[] fix45(int[] array) {
        int[] not4or5 = new int[array.length];
        int count4 = 0;
        int count5 = 0;
        int counterForNot4or5 = -1;
        for (int i = 1; i < array.length; i++) {
            if (!(array[i] == 4 || array[i] == 5)) {
                counterForNot4or5++;
                not4or5[counterForNot4or5] = array[i];
            }
        }

        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] == 4) {
                array[i] = 5;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 4) {
                count4++;
            } else if (array[i] == 5) {
                count5++;
            }
        }

        counterForNot4or5 = -1;
        if (count5 > count4) {
            if (array[0] == 5) {
                counterForNot4or5++;
                array[0] = not4or5[counterForNot4or5];
            }
            for (int i = 1; i < array.length; i++) {
                if (array[i] == 5) {
                    if (!(array[i - 1] == 4)) {
                        counterForNot4or5++;
                        array[i] = not4or5[counterForNot4or5];
                    }
                }
            }
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
