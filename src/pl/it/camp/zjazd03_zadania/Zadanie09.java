package pl.it.camp.zjazd03_zadania;

/**
 * https://codingbat.com/prob/p130788
 * Given 3 int values, a b c, return their sum. However,
 * if one of the values is 13 then it does not count towards the sum and values to its right do not count.
 * So for example, if b is 13, then both b and c do not count.
 * <p>
 * luckySum(1, 2, 3) → 6
 * luckySum(1, 2, 13) → 3
 * luckySum(1, 13, 3) → 1
 */
public class Zadanie09 {
    public static void main(String[] args) {
        System.out.println(luckySum(1, 2, 3));
        System.out.println(luckySum(1, 2, 13));
        System.out.println(luckySum(1, 13, 3));
    }

    public static int luckySum(int a, int b, int c) {
        int[] array = new int[]{a, b, c};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 13) {
                break;
            }
            sum += array[i];
        }
        return sum;
    }
}
