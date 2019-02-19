package string_1;

/**
 * Created by Sergio on 2/19/19.
 */

/**
 * Given a string, return a version without the first 2 chars.
 * Except keep the first char if it is 'a' and keep the second char if it is 'b'.
 * The string may be any length. Harder than it looks.

 deFront("Hello") → "llo"
 deFront("java") → "va"
 deFront("away") → "aay"
 */
public class DeFront {

    public String deFront(String str) {

        if ((str.startsWith("a", 0) & str.length() > 2) & (str.substring(1, 2).equals("b") & str.length() > 2)) {
            return "ab" + str.substring(2, str.length());
        }
        if (str.startsWith("a", 0) & str.length() > 2) {
            return "a" + str.substring(2, str.length());
        }
        if (str.startsWith("a", 0) & str.length() == 2) {
            if (str.substring(1, 2).equals("b")) {
                return "ab";
            }
            return "a";
        }
        if (str.substring(1, 2).equals("b") & str.length() > 2) {
            return "b" + str.substring(2, str.length());
        }
        if (str.length() > 2) {
            String withoutFirstChar = str.substring(2, str.length());
            return withoutFirstChar;
        }
        return "";
    }

}
