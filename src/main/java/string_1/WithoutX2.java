package string_1;

/**
 * Created by Sergio on 2/19/19.
 */

/**
 * Given a string, if one or both of the first 2 chars is 'x',
 * return the string without those 'x' chars, and otherwise return the string unchanged.
 * This is a little harder than it looks.

 withoutX2("xHi") → "Hi"
 withoutX2("Hxi") → "Hi"
 withoutX2("Hi") → "Hi"
 */
public class WithoutX2 {

    public String withoutX2(String str) {
        if (str.length() > 2) {
            if (str.startsWith("x", 0) & str.startsWith("x", 1)) {
                return str.substring(2, str.length());
            }
            if (str.startsWith("x", 0)) {
                return str.substring(1, str.length());
            }
            if (str.startsWith("x", 1)) {
                return str.charAt(0) + str.substring(2, str.length());
            }

        }
        if (str.length() == 2) {
            if (str.startsWith("x", 0) & str.startsWith("x", 1)) {
                return "";
            }
            if (str.startsWith("x", 0)) {
                return str.substring(1, str.length());
            }
            if (str.startsWith("x", 1)) {
                return str.substring(2, str.length());
            }

        }
        if (str.length() == 1 & str.equals("x")) {
            return "";
        }
        return str;

    }

}
