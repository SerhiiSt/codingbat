package string_2;

/**
 * Created by Sergio on 2/21/19.
 */

/**
 * Return a version of the given string, where for every star (*)
 * in the string the star and the chars immediately
 * to its left and right are gone.
 * So "ab*cd" yields "ad" and "ab**cd" also yields "ad".

 starOut("ab*cd") → "ad"
 starOut("ab**cd") → "ad"
 starOut("sm*eilly") → "silly"
 */
public class StarOut {

    public String starOut(String str) {
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') {
                continue;
            }
            if (i > 0 && str.charAt(i - 1) == '*') {
                continue;
            }
            if (i < str.length() - 1 && str.charAt(i + 1) == '*') {
                continue;
            }
            b.append(str.charAt(i));
        }

        return b.toString();
    }

}
