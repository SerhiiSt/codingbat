package string_2;

/**
 * Created by Sergio on 2/21/19.
 */

/**
 * Given two strings, return true if either of the strings appears at the very end of the other string,
 * ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").
 * Note: str.toLowerCase() returns the lowercase version of a string.

 endOther("Hiabc", "abc") → true
 endOther("AbC", "HiaBc") → true
 endOther("abc", "abXabc") → true
 */
public class EndOther {

    public boolean endOther(String a, String b) {
        int len1 = a.length();
        int len2 = b.length();


        if (len1 >= len2) {
            if (a.toLowerCase().substring((len1 - len2), len1).equals(b.toLowerCase())) {
                return true;
            }
        }
        if (len2 >= len1) {
            if (b.toLowerCase().substring((len2 - len1), len2).equals(a.toLowerCase())) {
                return true;

            }
        }
        return false;
    }

}
