package warmup_1;

/**
 * Created by Sergio on 2/18/19.
 */

/**
 * Given a string, we'll say that the front is the first 3 chars of the string.
 * If the string length is less than 3, the front is whatever is there.
 * Return a new string which is 3 copies of the front.

 front3("Java") → "JavJavJav"
 front3("Chocolate") → "ChoChoCho"
 front3("abc") → "abcabcabc"
 */
public class Front3 {

    public String front3(String str) {
        if (str.length() >= 3) {
            String firstThreeChars = str.substring(0, 3);
            return firstThreeChars + firstThreeChars + firstThreeChars;
        } else
            return str + str + str;
    }
}
