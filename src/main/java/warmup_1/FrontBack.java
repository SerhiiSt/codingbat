package warmup_1;

/**
 * Created by Sergio on 2/18/19.
 */

/**
 * Given a string, return a new string where the first and last chars have been exchanged.

 frontBack("code") → "eodc"
 frontBack("a") → "a"
 frontBack("ab") → "ba"
 */
public class FrontBack {

    public String frontBack(String str) {
        if (str.length() <= 1) return str;

        String mid = str.substring(1, str.length() - 1);

        return str.charAt(str.length() - 1) + mid + str.charAt(0);
    }

}
