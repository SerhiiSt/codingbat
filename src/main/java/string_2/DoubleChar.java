package string_2;

/**
 * Created by Sergio on 2/20/19.
 */

/**
 * Given a string, return a string where for every char in the original, there are two chars.

 doubleChar("The") → "TThhee"
 doubleChar("AAbb") → "AAAAbbbb"
 doubleChar("Hi-There") → "HHii--TThheerree"
 */
public class DoubleChar {

    public String doubleChar(String str) {
        String text = "";
        for (int i = 0; i < str.length(); i++) {

            text = text + str.charAt(i) + str.charAt(i);


        }
        return text;

    }

}
