package warmup_2;

/**
 * Given a string and a non-negative int n, return a larger string that is n copies of the original string.
 * <p>
 * <p>
 * stringTimes("Hi", 2) → "HiHi"
 * stringTimes("Hi", 3) → "HiHiHi"
 * stringTimes("Hi", 1) → "Hi"
 */
public class StringTimes {
    public String stringTimes(String str, int n) {
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < n; i++) {
            text.append(str);
        }
        return text.toString();

    }
}
