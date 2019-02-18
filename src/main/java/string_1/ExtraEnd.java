package string_1;

/**
 * Created by Sergio on 2/18/19.
 */

/**
 * Given a string, return a new string made of 3 copies of the last 2 chars of the original string.
 * The string length will be at least 2.

 extraEnd("Hello") → "lololo"
 extraEnd("ab") → "ababab"
 extraEnd("Hi") → "HiHiHi"
 */
public class ExtraEnd {

    public String extraEnd(String str) {
        if (str.length() >= 2) {
            String lastTwoChars = str.substring(str.length() - 2, str.length());
            return lastTwoChars + lastTwoChars + lastTwoChars;
        }
        return "";
    }

}
