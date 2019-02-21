package string_2;

/**
 * Created by Sergio on 2/21/19.
 */

/**
 * Given a string, does "xyz" appear in the middle of the string? To define middle,
 * we'll say that the number of chars to the left and right of the "xyz" must differ by at most one.
 * This problem is harder than it looks.

 xyzMiddle("AAxyzBB") → true
 xyzMiddle("AxyzBB") → true
 xyzMiddle("AxyzBBB") → false
 */
public class XyzMiddle {

    public boolean xyzMiddle(String str) {
        int len = str.length();
        if (len < 3) {
            return false;
        }
        int even = (len + 1) % 2;
        int mid = len / 2;
        return str.substring(mid - 1 - even, mid + 2).contains("xyz");
    }

}
