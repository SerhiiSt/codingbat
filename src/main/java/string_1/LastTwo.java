package string_1;

/**
 * Created by Sergio on 2/19/19.
 */

/**
 * Given a string of any length, return a new string where the last 2 chars,
 * if present, are swapped, so "coding" yields "codign".

 lastTwo("coding") → "codign"
 lastTwo("cat") → "cta"
 lastTwo("ab") → "ba"
 */
public class LastTwo {

    public String lastTwo(String str) {
        if (str.length() >= 2) {
            String bodyChar = str.substring(0, str.length() - 2);

            String lastFirstChar = str.substring(str.length() - 1);

            String lastSecondChar = str.substring(str.length() - 2, str.length() - 1);

            String temp = lastFirstChar;

            lastFirstChar = lastSecondChar;
            lastSecondChar = temp;

            return bodyChar + lastSecondChar + lastFirstChar;

        }
        return str;
    }


}
