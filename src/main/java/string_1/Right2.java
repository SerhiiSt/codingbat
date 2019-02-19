package string_1;

/**
 * Created by Sergio on 2/19/19.
 */

/**
 * Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start.
 * The string length will be at least 2.

 right2("Hello") → "loHel"
 right2("java") → "vaja"
 right2("Hi") → "Hi"
 */
public class Right2 {

    public String right2(String str) {
        if (str.length() > 2) {
            String firstChars = str.substring(0, str.length() - 2);
            String lastChars = str.substring(str.length() - 2, str.length());
            return lastChars + firstChars;
        }
        if (str.length() == 2) {
            return str;
        }
        return "";
    }

}
