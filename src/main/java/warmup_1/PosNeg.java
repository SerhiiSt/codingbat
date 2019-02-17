package warmup_1;

/**
 * Created by Sergio on 2/17/19.
 */

/**
 * Given 2 int values, return true if one is negative and one is positive.
 * Except if the parameter "negative" is true, then return true only if both are negative.

 posNeg(1, -1, false) → true
 posNeg(-1, 1, false) → true
 posNeg(-4, -5, true) → true
 */
public class PosNeg {

    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            if (a < 0 & b < 0) {
                return true;
            } else return false;
        }
        if ((a < 0 && b > 0) || (a > 0 && b < 0)) {
            return true;
        }

        return false;
    }
}
