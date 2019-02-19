package string_1;

/**
 * Created by Sergio on 2/19/19.
 */

/**
 * Given a string, return a string length 1 from its front, unless front is false,
 * in which case return a string length 1 from its back. The string will be non-empty.

 theEnd("Hello", true) → "H"
 theEnd("Hello", false) → "o"
 theEnd("oh", true) → "o"
 */
public class TheEnd {

    public String theEnd(String str, boolean front) {
        if (str.length() >= 1) {
            if (front) {
                return str.substring(0, 1);
            } else return str.substring(str.length() - 1);
        }
        return "";
    }

}
