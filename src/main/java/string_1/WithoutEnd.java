package string_1;

/**
 * Created by Sergio on 2/18/19.
 */

/**
 * Given a string, return a version without the first and last char,
 * so "Hello" yields "ell". The string length will be at least 2.

 withoutEnd("Hello") → "ell"
 withoutEnd("java") → "av"
 withoutEnd("coding") → "odin"
 */
public class WithoutEnd {

    public String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }
}
