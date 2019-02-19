package string_1;

/**
 * Created by Sergio on 2/19/19.
 */

/**
 * Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and".
 * The string length will be at least 3.

 middleThree("Candy") → "and"
 middleThree("and") → "and"
 middleThree("solving") → "lvi"
 */
public class MiddleThree {

    public String middleThree(String str) {
        if (str.length() > 3) {
            int start = (str.length() / 2) - 1;
            int end = (str.length() / 2) + 2;
            String mid = str.substring(start, end);
            return mid;
        }

        if (str.length() == 3) {
            return str;
        }

        return "";
    }
}
