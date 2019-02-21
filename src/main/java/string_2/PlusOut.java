package string_2;

/**
 * Created by Sergio on 2/21/19.
 */

/**
 * Given a string and a non-empty word string,
 * return a version of the original
 * String where all chars have been replaced by pluses ("+"),
 * except for appearances of the word string which are preserved unchanged.

 plusOut("12xy34", "xy") → "++xy++"
 plusOut("12xy34", "1") → "1+++++"
 plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"
 */
public class PlusOut {

    public String plusOut(String str, String word) {
        StringBuilder b = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            if (str.substring(i).startsWith(word)) {
                b.append(word);
                i = i + word.length();

            } else {
                b.append("+");
                i++;
            }


        }
        return b.toString();
    }

}
