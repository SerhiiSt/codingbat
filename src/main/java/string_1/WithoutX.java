package string_1;

/**
 * Created by Sergio on 2/19/19.
 */

/**
 * Given a string, if the first or last chars are 'x',
 * return the string without those 'x' chars,
 * and otherwise return the string unchanged.

 withoutX("xHix") → "Hi"
 withoutX("xHi") → "Hi"
 withoutX("Hxix") → "Hxi"
 */
public class WithoutX {

    public String withoutX(String str) {
        if (str.equals("x") || str.equals("")) {
            return "";
        }
        if (str.charAt(0) == 'x' & str.charAt(str.length() - 1) == 'x') {
            String mid = str.substring(1, str.length() - 1);
            return mid;
        }
        if (str.charAt(str.length() - 1) == 'x') {
            String beforeLast = str.substring(0, str.length() - 1);
            return beforeLast;
        }
        if (str.charAt(0) == 'x') {
            String afterFirst = str.substring(1, str.length());
            return afterFirst;
        }

        return str;
    }

}
