package warmup_2;

/**
 * Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
 * <p>
 * doubleX("axxbb") → true
 * doubleX("axaxax") → false
 * doubleX("xxxxx") → true
 */
public class DoubleX {

    static boolean doubleX(String str) {
        int index = str.indexOf("x");
        if (index == -1 || index + 1 >= str.length()) return false;
        return str.charAt(index + 1) == 'x';
    }
}
