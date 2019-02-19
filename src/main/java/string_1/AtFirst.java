package string_1;

/**
 * Created by Sergio on 2/19/19.
 */

/**
 * Given a string, return a string length 2 made of its first 2 chars.
 * If the string length is less than 2, use '@' for the missing chars.

 atFirst("hello") → "he"
 atFirst("hi") → "hi"
 atFirst("h") → "h@"
 */
public class AtFirst {

    public String atFirst(String str) {

        if (str.length() == 2) {
            return str;
        }
        if (str.length() > 2) {
            return str.substring(0, 2);
        }

        if (str.equals("")) {
            return "@@";
        }
        if (str.length() < 2) {
            return str + "@";
        }
        return "";
    }

}
