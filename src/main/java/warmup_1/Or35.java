package warmup_1;

/**
 * Created by Sergio on 2/18/19.
 */

/**
 *
 Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
 Use the % "mod" operator

 or35(3) → true
 or35(10) → true
 or35(8) → false
 */
public class Or35 {

    public boolean or35(int n) {
        if (n > 0) {
            if (n % 3 == 0 | n % 5 == 0)
                return true;
        }
        return false;
    }

}
