package logic_1;

/**
 * Created by Sergio on 2/20/19.
 */

/**
 * Given three ints, a b c, return true if one of them is 10 or more less than one of the others.

 lessBy10(1, 7, 11) → true
 lessBy10(1, 7, 10) → false
 lessBy10(11, 1, 7) → true
 */
public class LessBy10 {

    public boolean lessBy10(int a, int b, int c) {
        if ((Math.abs(a - b) >= 10 | Math.abs(a - c) >= 10 | Math.abs(b - c) >= 10) |
                (Math.abs(a - b) == 1 & Math.abs(a - c) == 1 & Math.abs(b - c) == 1)) {
            return true;
        }
        if ((Math.abs(a - b) == 0 & Math.abs(a - c) == 0 & Math.abs(b - c) == 0)) {
            return false;
        }
        return false;


    }
}
