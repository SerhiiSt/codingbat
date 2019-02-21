package string_2;

/**
 * Created by Sergio on 2/21/19.
 */

/**
 * Given a string, consider the prefix string made of the first N chars of the string.
 * Does that prefix string appear somewhere else in the string?
 * Assume that the string is not empty and that N is in the range 1..str.length().

 prefixAgain("abXYabc", 1) → true
 prefixAgain("abXYabc", 2) → true
 prefixAgain("abXYabc", 3) → false
 */
public class PrefixAgain {

    public boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);
        if (!str.equals("") & (n >= 1 & n <= str.length())) {
            for (int k = 0; k < str.length(); k++) {
                if (!(str.length() <= 1)) {
                    if (str.substring(prefix.length() + n).contains(prefix)) {
                        return true;
                    }
                }
                if (str.length() == 2) {
                    if (str.charAt(0) == str.charAt(1)) {
                        return true;
                    }
                }


            }
        }
        return false;


    }
}
