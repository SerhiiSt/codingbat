package string_1;

/**
 * Created by Sergio on 2/19/19.
 */

/**
 * Given two strings, append them together (known as "concatenation") and return the result.
 * However, if the strings are different lengths,
 * omit chars from the longer string so it is the same length as the shorter string.
 * So "Hello" and "Hi" yield "loHi". The strings may be any length.

 minCat("Hello", "Hi") → "loHi"
 minCat("Hello", "java") → "ellojava"
 minCat("java", "Hello") → "javaello"
 */
public class MinCat {

    public String minCat(String a, String b) {
        int aLen = a.length();
        int bLen = b.length();

        if (aLen > bLen) {
            int diff = aLen - bLen;
            String concat = a.substring(diff, a.length());
            return concat + b;

        }
        if (aLen < bLen) {
            int diff = bLen - aLen;
            String concat = b.substring(diff, b.length());
            return a + concat;
        }
        return a + b;
    }
}
