package string_2;

/**
 * Created by Sergio on 2/21/19.
 */

/**
 * Given a string, compute a new string by moving the first char to come after the next two chars,
 * so "abc" yields "bca". Repeat this process
 * for each subsequent group of 3 chars,
 * so "abcdef" yields "bcaefd".
 * Ignore any group of fewer than 3 chars at the end.

 oneTwo("abc") → "bca"
 oneTwo("tca") → "cat"
 oneTwo("tcagdo") → "catdog"
 */
public class OneTwo {

    public String oneTwo(String str) {
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < str.length(); i = i + 3) {
            if (str.length() > i + 2) {
                char first = str.charAt(i);
                String lastPart = str.substring(i + 1, i + 3);
                b.append(lastPart);
                b.append(first);
            }
        }
        return b.toString();
    }
}
