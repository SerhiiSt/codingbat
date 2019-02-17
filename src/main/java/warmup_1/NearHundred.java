package warmup_1;

/**
 * Created by Sergio on 2/17/19.
 */

/**
 * Given an int n, return true if it is within 10 of 100 or 200.
 * Note: Math.abs(num) computes the absolute value of a number.

 nearHundred(93) → true
 nearHundred(90) → true
 nearHundred(89) → false
 */
public class NearHundred {

    public boolean nearHundred(int n) {
        if ((Math.abs(n - 100) <= 10) || (Math.abs(n - 200) <= 10)) {
            return true;
        }
        return false;
    }
}
