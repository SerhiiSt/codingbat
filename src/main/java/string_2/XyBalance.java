package string_2;

/**
 * Created by Sergio on 2/21/19.
 */

/**
 * We'll say that a String is xy-balanced if for all the 'x' chars in the string,
 * there exists a 'y' char somewhere later in the string.
 * So "xxy" is balanced, but "xyx" is not.
 * One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.

 xyBalance("aaxbby") → true
 xyBalance("aaxbb") → false
 xyBalance("yaaxbb") → false
 */
public class XyBalance {

    public boolean xyBalance(String str) {
        int len = str.length() - 1;
        for (int k = len; k >= 0; k--) {
            char ch = str.charAt(k);
            if (ch == 'x') {
                return false;
            }
            if (ch == 'y') {
                return true;
            }
        }
        return true;
    }

}
