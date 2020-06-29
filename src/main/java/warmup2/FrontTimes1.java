package warmup2;

import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

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
public class FrontTimes1 {
    public String frontTimes(String str, int n) {
        if (str.length()>=3){
           return Stream.generate(() -> str.substring(0,3)).limit(n).collect(joining());
        }
        return Stream.generate(() -> str).limit(n).collect(joining());
    }
}
