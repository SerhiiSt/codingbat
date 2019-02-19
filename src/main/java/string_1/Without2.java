package string_1;

/**
 * Created by Sergio on 2/19/19.
 */

/**
 * Given a string, if a length 2 substring appears at both its beginning and end,
 * return a string without the substring at the beginning,
 * so "HelloHe" yields "lloHe". The substring may overlap with itself,
 * so "Hi" yields "". Otherwise, return the original string unchanged.

 without2("HelloHe") → "lloHe"
 without2("HelloHi") → "HelloHi"
 without2("Hi") → ""
 */
public class Without2 {

    public String without2(String str) {
        if (str.length() > 2) {
            String firstTwoCharsLack = str.substring(2, str.length());
            String firstTwoChars = str.substring(0, 2);
            String lastTwoChars = str.substring(str.length() - 2, str.length());
            if (firstTwoChars.equals(lastTwoChars)) {
                return firstTwoCharsLack;
            }
        }
        if (str.length() == 2) {
            return "";
        }

        return str;
    }

}
