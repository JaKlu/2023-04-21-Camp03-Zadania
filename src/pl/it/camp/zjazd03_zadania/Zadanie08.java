package pl.it.camp.zjazd03_zadania;

/**
 * https://codingbat.com/prob/p138990
 * Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1),
 * while the other is "far", differing from both other values by 2 or more.
 * Note: Math.abs(num) computes the absolute value of a number.
 * <p>
 * closeFar(1, 2, 10) → true
 * closeFar(1, 2, 3) → false
 * closeFar(4, 1, 3) → true
 */
public class Zadanie08 {
    public static void main(String[] args) {

        System.out.println(closeFar(1, 2, 10));
        System.out.println(closeFar(1, 2, 3));
        System.out.println(closeFar(4, 1, 3));
    }

    public static boolean closeFar(int a, int b, int c) {
        int close = 1;
        int far = 2;

        int distanceAB = Math.abs(a - b);
        int distanceAC = Math.abs(a - c);
        int distanceBC = Math.abs(b - c);

        if ((distanceAB <= close) && (distanceAC >= far && distanceBC >= far)) {
            return true;
        } else if ((distanceAC <= close) && (distanceAB >= far && distanceBC >= far)) {
            return true;
        } else return false;
    }
}
