package string_2;

/**
 * Created by Sergio on 2/21/19.
 */

/**
 *
 Given a string and an int n, return a string made of n repetitions of the
 last n characters of the string.
 You may assume that n is between 0 and the length of the string, inclusive.

 repeatEnd("Hello", 3) → "llollollo"
 repeatEnd("Hello", 2) → "lolo"
 repeatEnd("Hello", 1) → "o"
 */
public class RepeatEnd {

    public String repeatEnd(String str, int n) {
        StringBuilder builder = new StringBuilder();
        if (n >= 0 & n <= str.length()) {
            for (int i = 0; i < n; i++) {
                String lastThree = str.substring(str.length() - n, str.length());
                builder.append(lastThree);
            }

            return builder.toString();
        }
        return "";
    }

}
