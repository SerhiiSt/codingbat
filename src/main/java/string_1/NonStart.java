package string_1;

/**
 * Created by Sergio on 2/18/19.
 */

/**
 * Given 2 strings, return their concatenation,
 * except omit the first char of each. The strings will be at least length 1.

 nonStart("Hello", "There") → "ellohere"
 nonStart("java", "code") → "avaode"
 nonStart("shotl", "java") → "hotlava"
 */
public class NonStart {

    public String nonStart(String a, String b) {
        if (a.length() >= 1 & b.length() >= 1) {
            String afterA = a.substring(1, a.length());
            String afterB = b.substring(1, b.length());
            return afterA + afterB;
        }
        return "";
    }

}
