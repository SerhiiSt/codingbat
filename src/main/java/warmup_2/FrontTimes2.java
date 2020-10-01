package warmup_2;

/**
 * Given a string and a non-negative int n, we'll say that the front
 * of the string is the first 3 chars, or whatever is
 * there if the string is less than length 3.
 * Return n copies of the front;
 * <p>
 * <p>
 * frontTimes("Chocolate", 2) → "ChoCho"
 * frontTimes("Chocolate", 3) → "ChoChoCho"
 * frontTimes("Abc", 3) → "AbcAbcAbc"
 */
public class FrontTimes2 {
    public String frontTimes(String str, int n) {
        int len = 3;
        if (str.length() < 3) {
            len = str.length();
        }
        String result = "";
        String text = str.substring(0, len);
        for (int i = 0; i < n; i++) {
            result += text;
        }
        return result;
    }
}
