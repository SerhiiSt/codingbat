package string_1;

/**
 * Created by Sergio on 2/19/19.
 */

/**
 * Given a string of even length, return a string made of the middle two chars,
 * so the string "string" yields "ri". The string length will be at least 2.

 middleTwo("string") → "ri"
 middleTwo("code") → "od"
 middleTwo("Practice") → "ct"
 */
public class MiddleTwo {

    public String middleTwo(String str) {
        if (str.length() % 2 == 0 & str.length() >= 2) {
            return str.substring((str.length() / 2) - 1, (str.length() / 2) + 1);
        }
        return "";
    }

}
