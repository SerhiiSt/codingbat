package string_1;

/**
 * Created by Sergio on 2/19/19.
 */

/**
 * Given two strings, append them together (known as "concatenation") and return the result.
 * However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".

 conCat("abc", "cat") → "abcat"
 conCat("dog", "cat") → "dogcat"
 conCat("abc", "") → "abc"
 */
public class ConCat {

    public String conCat(String a, String b) {
        if (a.length() >= 1 & b.length() >= 1) {
            String concat = a + b;
            String lastCharA = a.substring(0, a.length() - 1);
            String lastChar = a.substring(a.length() - 1);
            String firstChar = b.substring(0, 1);


            if (lastChar.equals(firstChar)) {
                return lastCharA + b;
            } else return a + b;

        }
        if (a.equals("")) {
            return b;
        }

        if (b.equals("")) {
            return a;
        }

        return "";
    }
}
