package warmup_1;

/**
 * Created by Sergio on 2/17/19.
 */

/**
 * Given a non-empty string and an int n, return a new string where the char at index n has been removed.
 * The value of n will be a valid index of a char in the original string
 * (i.e. n will be in the range 0..str.length()-1 inclusive).

 missingChar("kitten", 1) → "ktten"
 missingChar("kitten", 0) → "itten"
 missingChar("kitten", 4) → "kittn"
 */
public class MissingChar {

    public String missingChar(String str, int n) {
        String beforeInt = str.substring(0, n);
        String afterInt = str.substring(n + 1, str.length());
        return beforeInt + afterInt;
    }

}
