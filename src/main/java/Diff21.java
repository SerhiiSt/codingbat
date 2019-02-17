/**
 * Created by Sergio on 2/17/19.
 */

/**
 * Given an int n, return the absolute difference between n and 21,
 * except return double the absolute difference if n is over 21.

 diff21(19) → 2
 diff21(10) → 11
 diff21(21) → 0
 */
public class Diff21 {

    public int diff21(int n) {

        int div = 21 - n;
        int div_d = n - 21;
        if (n < 21) {
            return div;
        }

        if (n > 21) {
            return 2 * div_d;
        }
        if (n == 21) {
            return 0;
        }
        return 2 * div;
    }

}
