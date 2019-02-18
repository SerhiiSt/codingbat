package warmup_1;

/**
 * Created by Sergio on 2/18/19.
 */

/**
 * Given three int values, a b c, return the largest.

 intMax(1, 2, 3) → 3
 intMax(1, 3, 2) → 3
 intMax(3, 2, 1) → 3
 */
public class IntMax {

    public int intMax(int a, int b, int c) {

        return a > b ? a > c ? a : c : b > c ? b : c;

    }
}
