package string_2;

/**
 * Created by Sergio on 2/21/19.
 */


/**
 * Given two strings, a and b, create a bigger string made of the first char of a,
 * the first char of b, the second char of a,
 * the second char of b, and so on.
 * Any leftover chars go at the end of the result.

 mixString("abc", "xyz") → "axbycz"
 mixString("Hi", "There") → "HTihere"
 mixString("xxxx", "There") → "xTxhxexre"
 */
public class MixString {

    public String mixString(String a, String b) {
        String text = "";
        if (a.length() == b.length()) {
            for (int k = 0; k < a.length(); k++) {
                text = text + a.charAt(k) + b.charAt(k);
            }
            return text;
        }

        if (a.length() < b.length()) {
            for (int k = 0; k < a.length(); k++) {
                text = text + a.charAt(k) + b.charAt(k);
            }
            return text + b.substring(a.length(), b.length());
        }
        if (a.length() > b.length()) {
            for (int k = 0; k < b.length(); k++) {
                text = text + a.charAt(k) + b.charAt(k);

            }
            return text + a.substring(b.length(), a.length());
        }
        return "";
    }

}
