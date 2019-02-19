package string_1;

/**
 * Created by Sergio on 2/19/19.
 */

/**
 * Given a string and an int n, return a string made of the first and last n chars from the string.
 * The string length will be at least n.

 nTwice("Hello", 2) → "Helo"
 nTwice("Chocolate", 3) → "Choate"
 nTwice("Chocolate", 1) → "Ce"
 */
public class NTwice {

    public String nTwice(String str, int n) {
        if (str.length() >= n) {
            String firstNchars = str.substring(0, n);
            String lastNchars = str.substring(str.length() - n, str.length());
            return firstNchars + lastNchars;
        }
        return "";
    }
}
