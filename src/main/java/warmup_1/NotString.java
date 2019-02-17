package warmup_1;

/**
 * Created by Sergio on 2/17/19.
 */

/**
 * Given a string, return a new string where "not " has been added to the front.
 * However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.

 notString("candy") → "not candy"
 notString("x") → "not x"
 notString("not bad") → "not bad"
 */
public class NotString {

    public String notString(String str) {
        String not = "not";
        int len = str.length();

        if (len < 2) {
            return new String(not + " " + str);
        }
        if (str.equals("not")) {
            return str;
        }
        if (len > 2) {
            String myString = str.substring(0, 3);
            if (myString.equals("not")) {
                return str;
            }
        }
        return "not" + " " + str;
    }

}
