package pl.it.camp.zjazd03_zadania;

/**
 * https://codingbat.com/prob/p155405
 * Given n>=0, create an array length n*n with the following pattern,
 * shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1}
 * (spaces added to show the 3 groups).
 * <p>
 * squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]
 * squareUp(2) → [0, 1, 2, 1]
 * squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
 */
public class Zadanie06 {
    public static void main(String[] args) {
        printArray(squareUp(3));
        printArray(squareUp(2));
        printArray(squareUp(4));
    }

    public static int[] squareUp(int n) {
        int[] array = new int[n * n];
        int counter = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                counter++;
                if (j + i > n - 2) {
                    array[counter] = n - j;
                } else array[counter] = 0;
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
