package warmup_1;

/**
 * Created by Sergio on 2/18/19.
 */

/**
 * Given 2 int values, return whichever value is nearest to the value 10,
 * or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.

 close10(8, 13) → 8
 close10(13, 8) → 8
 close10(13, 7) → 0
 */
public class Close10 {

    public int close10(int a, int b) {

        int a1 = Math.abs(a - 10);
        int b1 = Math.abs(b - 10);

        if (a1 < b1) {
            return a;
        }
        if (b1 < a1) {
            return b;
        } else return 0;
    }


}
