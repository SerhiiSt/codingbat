package string_1;

/**
 * Created by Sergio on 2/19/19.
 */

/**
 * Given a string, return true if "bad" appears starting at index 0 or 1 in the string,
 * such as with "badxxx" or "xbadxx" but not "xxbadxx".
 * The string may be any length, including 0. Note: use .equals() to compare 2 strings.

 hasBad("badxx") → true
 hasBad("xbadxx") → true
 hasBad("xxbadxx") → false
 */
public class HasBad {

    public boolean hasBad(String str) {
        if (str.startsWith("bad", 0) | str.startsWith("bad", 1)) {
            return true;
        }
        return false;
    }

}
