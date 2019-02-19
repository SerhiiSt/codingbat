package string_1;

/**
 * Created by Sergio on 2/19/19.
 */

/**
 * Given a string, return a version without both the first and last char of the string.
 * The string may be any length, including 0.

 withouEnd2("Hello") → "ell"
 withouEnd2("abc") → "b"
 withouEnd2("ab") → ""
 */
public class WithoutEnd2 {

    public String withoutEnd2(String str) {
        if (str.length() >= 2) {
            String mid = str.substring(1, str.length() - 1);
            return mid;
        } else return "";
    }

}
