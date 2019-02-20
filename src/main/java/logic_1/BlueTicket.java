package logic_1;

/**
 * Created by Sergio on 2/20/19.
 */

/**
 * You have a blue lottery ticket, with ints a, b, and c on it.
 * This makes three pairs, which we'll call ab, bc, and ac.
 * Consider the sum of the numbers in each pair.
 * If any pair sums to exactly 10, the result is 10.
 * Otherwise if the ab sum is exactly 10 more than either bc or ac sums, the result is 5.
 * Otherwise the result is 0.

 blueTicket(9, 1, 0) → 10
 blueTicket(9, 2, 0) → 0
 blueTicket(6, 1, 4) → 10
 */
public class BlueTicket {

    public int blueTicket(int a, int b, int c) {
        int sumAB = a + b;
        int sumBC = b + c;
        int sumAC = a + c;
        if (sumAB == 10 | sumBC == 10 | sumAC == 10) {
            return 10;
        }
        if (sumAB > 10) {
            if ((sumAB > sumBC | sumAB > sumAC) & (sumAB < sumBC | sumAB < sumAC) | (a < b & b > c)) {

                return 5;
            }
        }
        return 0;

    }
}
